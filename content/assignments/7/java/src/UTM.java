import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.List;
import java.util.stream.Collectors;

public class UTM {
	public boolean run(String tmSpec, Tape tape) {
        TM tm = parseTMSpec(tmSpec);
        return tm.run(tape);
    }

    private static TM parseTMSpec(String tmSpec) {
        Map<String, TM.State> stateMap = new HashMap<>();
        String startStateName = null;
        Set<String> acceptStateNames = new HashSet<>();
        TM tmInstance = null; // Variable to hold the final TM
		//Regex formation
        final String mainRegex = "(\\w+|\\[\\*\\])\\s*-->\\s*(\\w+|\\[\\*\\])(?: : (.+))?";
        final Pattern mainPattern = Pattern.compile(mainRegex);
        final String conditionRegex = "([\\w⊔*])->([\\w⊔*]),([LR])";
        final Pattern conditionPattern = Pattern.compile(conditionRegex);
        final String START_SYM = "[*]";

        List<String> lines = tmSpec.lines().map(String::trim).filter(line -> !line.isEmpty() && !line.startsWith("stateDiagram-v2")).collect(Collectors.toList());

        // Identify states and store in HashMap
        for (String line : lines) {
            Matcher mainMatcher = mainPattern.matcher(line);
            if (mainMatcher.find()) {
                String sourceName = mainMatcher.group(1);
                String destName = mainMatcher.group(2);
                if (sourceName.equals(START_SYM)) startStateName = destName;
                else if (destName.equals(START_SYM)) acceptStateNames.add(sourceName);
                stateMap.computeIfAbsent(sourceName, k -> new TM.State());
                stateMap.computeIfAbsent(destName, k -> new TM.State());
            }
        }

        if (startStateName == null || !stateMap.containsKey(startStateName)) {
            throw new IllegalArgumentException("TM Spec missing a valid start state definition.");
        }
        tmInstance = new TM(stateMap.get(startStateName));
        for (String acceptName : acceptStateNames) {
            tmInstance.addAcceptState(stateMap.get(acceptName));
        }

        // Add transitions
        for (String line : lines) {
             Matcher mainMatcher = mainPattern.matcher(line);

             if (mainMatcher.find()) {
                String sourceName = mainMatcher.group(1);
                String destName = mainMatcher.group(2);
                String transitionsRaw = mainMatcher.group(3);

                if (sourceName.equals(START_SYM) || destName.equals(START_SYM) || transitionsRaw == null) {
                    continue; //No transitions for these
                }

                // Retrieve the actual State objects from the map using the names
                TM.State sourceStateObject = stateMap.get(sourceName);
                TM.State destStateObject = stateMap.get(destName);
                String[] conditions = transitionsRaw.split("\\|");
                for (String condition : conditions) {
                    Matcher conditionMatcher = conditionPattern.matcher(condition.trim()); //REmove preceding and trailing whitespace before matching.
                    if (conditionMatcher.find()) {
                        char readSymbol = conditionMatcher.group(1).charAt(0);
                        char writeSymbol = conditionMatcher.group(2).charAt(0);
                        String directionStr = conditionMatcher.group(3);
						Tape.Direction direction = (directionStr.equals("R")) ? Tape.Direction.R : Tape.Direction.L; // Tape.Direction enum values
						sourceStateObject.addTransition(readSymbol, destStateObject, writeSymbol, direction); //add the transition

                    } else {
                        System.err.println("    Failed to parse condition details: " + condition);
                    }
                }
             }
        }

        return tmInstance;
    }
}
