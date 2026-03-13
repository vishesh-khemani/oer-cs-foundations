import java.util.Stack;

/**
 * The tape for a Turing Machine.
 * The tape extends infinitely in both directions.
 * Symbols on the tape are contiguous, demarcated on each end by the
 * EMPTY_SYMBOL (which must not be in the alphabet).
 * The tape head is always positioned either on a symbol or on an EMPTY_SYMBOL
 * immediately to the left or the right of the symbols on the tape.
 */
public class Tape {
    /**
     * The symbol that denotes an empty cell. The alphabet must not include this
     * symbol.
     */
    public static final char EMPTY_SYMBOL = ' ';

    /** The directions in which the tape head can move one cell over. */
    public static enum Direction {
        L, R
    }

    /**
     * Constructs an infinite tape initialized with the specified input, with the
     * tape head at the start of the input.
     */
    public Tape(String input) {
        for (int i = 0; i < input.length(); i++) {
            writeSymbol(input.charAt(i));
            move(Direction.R);
        }
        for (int i = 0; i < input.length(); i++) {
            move(Direction.L);
        }
    }

    /** Returns the symbol at the tape head. */
    public char readSymbol() {
        return currentSymbol;
    }

    /** Replaces the symbol at the tape head with the specified symbol. */
    public void writeSymbol(char symbol) {
        currentSymbol = symbol;
    }

    /** Moves the tape head one cell in the specified direction. */
    public void move(Direction d) {
        // TODO: implement.
    }

    /**
     * Returns the contents of the tape as a String (not including spaces to the
     * left and the right of the contents). The tape head does not move.
     */
    @Override
    public String toString() {
        // TODO: implement.
        return null;
    }

    // The symbol at the tape head.
    private char currentSymbol = EMPTY_SYMBOL;

    // The symbols to the left of the tape head. The top of the stack is the symbol
    // to the immediate left.
    private final Stack<Character> leftSymbols = new Stack<>();

    // The symbols to the right of the tape head. The top of the stack is the symbol
    // to the immediate right.
    private final Stack<Character> rightSymbols = new Stack<>();
}
