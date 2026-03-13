import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ReverseTMTest {
    public ReverseTMTest() {
        // TODO: define TM states.

        // TODO: define TM transitions.

        // TODO: construct TM, specifying the start state, and accept/reject states.
        tm = new TM(null); // placeholder
    }

    @Test
    public void testValid() {
        Tape tape = new Tape("a");
        assertTrue(tm.run(tape));
        assertEquals("a", tape.toString());

        tape = new Tape("ab");
        assertTrue(tm.run(tape));
        assertEquals("ba", tape.toString());

        tape = new Tape("abba");
        assertTrue(tm.run(tape));
        assertEquals("abba", tape.toString());

        tape = new Tape("baa");
        assertTrue(tm.run(tape));
        assertEquals("aab", tape.toString());
    }

    @Test
    public void testInvalid() {
        Tape tape = new Tape("c");
        assertFalse(tm.run(tape));
        assertEquals("c", tape.toString());
    }

    private final TM tm;
}
