import java.util.HashSet;
import java.util.Set;

/** A virtual Turing Machine. */
public class TM {

    /** A TM State. */
    public static class State {
        /**
         * Defines the next state, the symbol to write, and the direction to move the
         * tape head, when the specified 'symbol' is read in this state.
         */
        void addTransition(Character symbol, State nextState, Character writeSymbol, Tape.Direction direction) {
            // TODO: implement.
        }

        /**
         * Processes the specified symbol at the tape head by executing the write/move
         * actions on the tape and returning the next state.
         */
        State processSymbol(Character symbol, Tape tape) {
            // TODO: implement.
            return null;
        }

        // TODO: add member variables.
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
     * accepted the input.
     */
    public boolean run(Tape tape) {
        // TODO: implement.
        return false;
    }

    private final State startState;
    private final Set<State> acceptStates = new HashSet<>();
    private final Set<State> rejectStates = new HashSet<>();
}
