import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PalindromeTMTest {
    public PalindromeTMTest() {
        // TODO: define TM states.

        // TODO: define TM transitions.

        // TODO: construct TM, specifying the start state, and accept/reject states.
        tm = new TM(null); // placeholder
    }

    @Test
    public void testValid() {
        Tape tape = new Tape("a");
        assertTrue(tm.run(tape));

        tape = new Tape("ab");
        assertFalse(tm.run(tape));

        tape = new Tape("abba");
        assertTrue(tm.run(tape));

        tape = new Tape("baa");
        assertFalse(tm.run(tape));

        tape = new Tape("bab");
        assertTrue(tm.run(tape));
    }

    @Test
    public void testInvalid() {
        Tape tape = new Tape("c");
        assertFalse(tm.run(tape));
    }

    private final TM tm;
}
