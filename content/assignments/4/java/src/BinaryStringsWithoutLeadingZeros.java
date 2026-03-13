public class BinaryStringsWithoutLeadingZeros {

    /** Returns a new NFA that recognizes the language specified by the RE `0`. */
    public static NFA createNFAForZero() {
        NFA nfa = new NFA();

        // TODO: define the NFA's start and accept states, and the state transitions.

        return nfa;
    }

    /** Returns a new NFA that recognizes the language specified by the RE `1`. */
    public static NFA createNFAForOne() {
        NFA nfa = new NFA();

        // TODO: define the NFA's start and accept states, and the state transitions.

        return nfa;
    }

    /** Returns a new NFA that recognizes the language specified by the RE `0|1`. */
    public static NFA createNFAForBinaryDigit() {
        NFA nfaForZero = createNFAForZero();
        NFA nfaForOne = createNFAForOne();

        // TODO: define a new NFA that uses an appropriate NFA operation on nfaForZero
        // and nfaForOne to recognize the language specified by the RE `0|1`.

        return null;
    }

    /**
     * Returns a new NFA that recognizes the language specified by the RE `(0|1)*`.
     */
    public static NFA createNFAForBinaryString() {
        NFA nfaForBinaryDigit = createNFAForBinaryDigit();

        // TODO: define a new NFA that uses an appropriate NFA operation on
        // nfaForBinaryDigit to recognize the language specified by the RE `(0|1)*`.

        return null;
    }

    /**
     * Returns a new NFA that recognizes the language specified by the RE
     * `1.(0|1)*`.
     */
    public static NFA createNFAForBinaryStringWithLeadingOne() {
        NFA nfaForOne = createNFAForOne();
        NFA nfaForBinaryString = createNFAForBinaryString();

        // TODO: define a new NFA that uses an appropriate NFA operation on
        // nfaForOne and nfaForBinaryString to recognize the language specified by the
        // RE `1.(0|1)*`.

        return null;
    }

    /**
     * Returns a new NFA that recognizes the language specified by the RE
     * `0|(1.(0|1)*)`.
     */
    public static NFA createNFAForBinaryStringsWithNoLeadingZeros() {
        NFA nfaForZero = createNFAForZero();
        NFA nfaForBinaryStringWithLeadingOne = createNFAForBinaryStringWithLeadingOne();

        // TODO: define a new NFA that uses an appropriate NFA operation on
        // nfaForZero and nfaForBinaryStringWithLeadingOne to recognize the language
        // specified by the RE `0|(1.(0|1)*)`.

        return null;
    }
}
