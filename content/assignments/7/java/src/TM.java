import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/** A virtual Turing Machine. */
public class TM {

    /** A TM State. */
    public static class State {
        private static class Transition {
            Transition(State nextState, Character writeSymbol, Tape.Direction direction) {
                this.nextState = nextState;
                this.writeSymbol = writeSymbol;
                this.direction = direction;
            }

            private final State nextState;
            private final Character writeSymbol;
            private final Tape.Direction direction;
        }

        /**
         * Defines the next state, the symbol to write, and the direction to move the
         * tape head, when the specified 'symbol' is read in this state.
         */
        void addTransition(Character symbol, State nextState, Character writeSymbol, Tape.Direction direction) {
            // TODO: implement.
            transitions.put(symbol, new Transition(nextState, writeSymbol, direction));
        }

        /**
         * Processes the specified symbol at the tape head by executing the write/move
         * actions on the tape and returning the next state.
         */
        State processSymbol(Character symbol, Tape tape) {
            // TODO: implement.
            Transition transition = transitions.get(symbol);
            if (transition == null) {
                return null;
            }
            tape.writeSymbol(transition.writeSymbol);
            tape.move(transition.direction);
            return transition.nextState;
        }

        // TODO: add member variables.
        private final Map<Character, Transition> transitions = new HashMap<>();
    }

    /** Constructs a TM with the specified start state. */
    public TM(State startState) {
        this.startState = startState;
    }

    /**
     * Adds the specified state as an accept state. The TM will halt if it reaches
     * an accept state.
     */
    public void addAcceptState(State state) {
        if (rejectStates.contains(state)) {
            throw new IllegalArgumentException("A state can't be both an accept and reject state");
        }
        acceptStates.add(state);
    }

    /**
     * Adds the specified state as a reject state. The TM will halt if it reaches
     * a reject state.
     */
    public void addRejectState(State state) {
        if (acceptStates.contains(state)) {
            throw new IllegalArgumentException("A state can't be both an accept and reject state");
        }
        rejectStates.add(state);
    }

    /**
     * Runs the TM on the specified tape configured with the input. Assumes that
     * initially the tape head is at the start of the input. Returns whether the TM
     * accepted the input. Leaves the tape head at the start of the tape contents.
     */
    public boolean run(Tape tape) {
        // TODO: implement.
        State currentState = startState;
        while (true) {
            if (currentState == null) {
                // Shortcut for no valid transition.
                return false;
            }
            if (acceptStates.contains(currentState)) {
                return true;
            }
            if (rejectStates.contains(currentState)) {
                return false;
            }
            char currentSymbol = tape.readSymbol();
            currentState = currentState.processSymbol(currentSymbol, tape);
        }
    }

    private final State startState;
    private final Set<State> acceptStates = new HashSet<>();
    private final Set<State> rejectStates = new HashSet<>();
}
