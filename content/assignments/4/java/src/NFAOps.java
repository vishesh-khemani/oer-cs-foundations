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

        // TODO: define the result NFA's start and accept states, and the state
        // transitions.

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

        // TODO: create and set a new start state for the result NFA.

        // TODO: Add null transitions from the result start state to the start states of
        // n1 and n2.

        // TODO: Add the accept states of n1 and n2 to the accept states of the result
        // NFA.

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

        // TODO: Set the start state of the result NFA to be the start state of n1.

        // TODO: Add null transitions from the accept states of n1 to the start state of
        // n2.

        // TODO: Add the accept states of n2 to the accept states of the result NFA.

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

        // TODO: Set the start state of the result NFA to be the start state of n1.

        // TODO: For each accept state of n1:
        // 1. Set it as an accept state of the result NFA
        // 2. Add a null transition to the start state of n1/result

        // TODO: Add the start state of the result NFA as an accept state.

        return result;
    }
}
