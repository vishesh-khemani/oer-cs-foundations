import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/** A virtual Nondeterministic Finite Automata (NFA). */
public class NFA {

    /** An NFA State. */
    public static class State {
        /**
         * Defines an NFA transition from this state to the 'to' state when the
         * specified 'symbol' is read. The symbol '\0' denotes a null/epsilon
         * transition.
         */
        void addTransition(Character symbol, State to) {
            // TODO: implement.
        }

        /**
         * Returns the next states when 'symbol' is read in this state.
         * The symbol '\0' denotes a null/epsilon transition.
         */
        Iterable<State> getTransitions(Character symbol) {
            // TODO: implement.
            return null;
        }
    }

    /** Defines the NFA start state. */
    public void setStartState(State state) {
        if (startState != null) {
            throw new IllegalStateException("There's already a start state defined for this NFA");
        }
        startState = state;
    }

    /** Returns the NFA start state. */
    public State getStartState() {
        return startState;
    }

    /** Defines an accept state for the NFA. */
    public void addAcceptState(State state) {
        acceptStates.add(state);
    }

    /** Returns the set of accept states for the NFA. */
    public Set<State> getAcceptStates() {
        return Collections.unmodifiableSet(acceptStates);
    }

    /** Returns whether the specified input is accepted by the NFA. */
    public boolean accepts(String input) {
        return accepts(startState, input, 0);
    }

    /**
     * Helper method for accepts(String).
     * Returns whether the NFA, starting in 'currentState', accepts the
     * specified 'input', starting at 'nextSymbolIndex'.
     */
    private boolean accepts(State currentState, String input, int nextSymbolIndex) {
        // TODO: (1) Find the set of states reachable from currentState via null/epsilon
        // transitions. This set of states is known as the null closure of currentState.

        // TODO: (2) If input is exhausted, check if any state in the null closure is an
        // accept state. If so, return true. If not, return false.

        // TODO: (3) For each state in the null closure, find the set of states
        // reachable from that state via a transition labeled with the next input
        // symbol.
        // Recursively call accepts() for each of those states, with nextSymbolIndex
        // incremented by 1. If any of those calls returns true, return true. Otherwise
        // return false.

        return false;
    }

    /**
     * Adds to 'closure' all states reachable from 'state' via null/epsilon
     * transitions (include 'state' itself).
     */
    private void getNullClosure(State state, Set<State> closure) {
        if (!closure.add(state)) {
            return;
        }
        for (State nextState : state.getTransitions('\0')) {
            getNullClosure(nextState, closure);
        }
    }

    private State startState = null;
    private final Set<State> acceptStates = new HashSet<>();
}
