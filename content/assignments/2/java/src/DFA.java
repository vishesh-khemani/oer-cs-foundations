import java.util.Set;

/** A virtual Deterministic Finite Automata (DFA). */
public class DFA {

    /** A DFA State. */
    public static class State {
        /**
         * Defines a DFA transition from this state to the 'to' state when the specified
         * 'symbol' is read.
         */
        void addTransition(Character symbol, State to) {
            // TODO: implement.
        }

        /**
         * Returns the next state (possibly this) when 'symbol' is read in this state.
         */
        State getTransition(Character symbol) {
            // TODO: implement.
            return null;
        }
    }

    /** Defines the DFA start state. */
    public void setStartState(State state) {
        // TODO: implement.
    }

    /** Returns the DFA start state. */
    public State getStartState() {
        // TODO: implement.
        return null;
    }

    /** Defines an accept state for the DFA. */
    public void addAcceptState(State state) {
        // TODO: implement.
    }

    /** Returns the set of accept states for the DFA. */
    public Set<State> getAcceptStates() {
        // TODO: implement.
        return null;
    }

    /** Returns whether the specified input is accepted by the DFA. */
    public boolean accepts(String input) {
        // TODO: implement.
        return false;
    }

}
