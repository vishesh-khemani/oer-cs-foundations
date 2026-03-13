import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ComplementTMTest {

    public ComplementTMTest() {
        // TODO: define TM states.

        // TODO: define TM transitions.

        // TODO: construct TM, specifying the start state, and accept/reject states.
        tm = new TM(null); // placeholder
    }

    @Test
    public void testValid() {
        Tape tape = new Tape("0");
        assertTrue(tm.run(tape));
        assertEquals("1", tape.toString());

        tape = new Tape("1");
        assertTrue(tm.run(tape));
        assertEquals("0", tape.toString());

        tape = new Tape("101");
        assertTrue(tm.run(tape));
        assertEquals("010", tape.toString());
    }

    @Test
    public void testInvalid() {
        Tape tape = new Tape("2");
        assertFalse(tm.run(tape));
        assertEquals("2", tape.toString());
    }

    private final TM tm;
}
