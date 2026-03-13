import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FilterTMTest {

    public FilterTMTest() {
        // TODO: define TM states.

        // TODO: define TM transitions.

        // TODO: construct TM, specifying the start state, and accept/reject states.
        tm = new TM(null); // placeholder
    }

    @Test
    public void testValid() {
        Tape tape = new Tape("1");
        assertTrue(tm.run(tape));
        assertEquals("1", tape.toString());

        tape = new Tape("101");
        assertTrue(tm.run(tape));
        assertEquals("11", tape.toString());

        tape = new Tape("0000");
        assertTrue(tm.run(tape));
        assertEquals("", tape.toString());
    }

    @Test
    public void testInvalid() {
        Tape tape = new Tape("2");
        assertFalse(tm.run(tape));
        assertEquals("2", tape.toString());
    }

    private final TM tm;
}
