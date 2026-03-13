/**
 * An implementation of regular language operations on their NFA equivalents.
 */
public class NFAOps {

    /**
     * Returns a new NFA that recognizes the language consisting of the single
     * symbol.
     */
    public static NFA createForSymbol(char symbol) {
        NFA result = new NFA();

        NFA.State start = new NFA.State();
        result.setStartState(start);
        NFA.State accept = new NFA.State();
        result.addAcceptState(accept);
        start.addTransition(symbol, accept);

        return result;
    }

    /**
     * Returns a new NFA that recognizes the union of the regular languages
     * recognized by n1 and n2.
     * This has the side-effect of possibly modifying n1 and n2, and the caller
     * should not use them anymore after this method returns.
     */

    public static NFA union(NFA n1, NFA n2) {
        NFA result = new NFA();

        // Create and set a new start state for the result NFA.
        NFA.State start = new NFA.State();
        result.setStartState(start);

        // Add null transitions from the result start state to the start states of
        // n1 and n2.
        start.addTransition('\0', n1.getStartState());
        start.addTransition('\0', n2.getStartState());

        // Add the accept states of n1 and n2 to the accept states of the result
        // NFA.
        for (NFA.State acceptState : n1.getAcceptStates()) {
            result.addAcceptState(acceptState);
        }
        for (NFA.State acceptState : n2.getAcceptStates()) {
            result.addAcceptState(acceptState);
        }

        return result;
    }

    /**
     * Returns a new NFA that recognizes the concatenation of the regular languages
     * recognized by n1 and n2.
     * This has the side-effect of possibly modifying n1 and n2, and the caller
     * should not use them anymore after this method returns.
     */
    public static NFA concatenation(NFA n1, NFA n2) {
        NFA result = new NFA();

        // Set the start state of the result NFA to be the start state of n1.
        result.setStartState(n1.getStartState());

        // Add null transitions from the accept states of n1 to the start state of
        // n2.
        for (NFA.State acceptState : n1.getAcceptStates()) {
            acceptState.addTransition('\0', n2.getStartState());
        }

        // Add the accept states of n2 to the accept states of the result NFA.
        for (NFA.State acceptState : n2.getAcceptStates()) {
            result.addAcceptState(acceptState);
        }

        return result;
    }

    /**
     * Returns a new NFA that recognizes the closure of the regular language
     * recognized by n1.
     * This has the side-effect of possibly modifying n1 and n2, and the caller
     * should not use them anymore after this method returns.
     */
    public static NFA closure(NFA n1) {
        NFA result = new NFA();

        // Set the start state of the result NFA to be the start state of n1.
        result.setStartState(n1.getStartState());

        // For each accept state of n1:
        // 1. Set it as an accept state of the result NFA
        // 2. Add a null transition to the start state of n1/result
        for (NFA.State acceptState : n1.getAcceptStates()) {
            result.addAcceptState(acceptState);
            acceptState.addTransition('\0', result.getStartState());
        }

        // Add the start state of the result NFA as an accept state.
        result.addAcceptState(result.getStartState());

        return result;
    }
}