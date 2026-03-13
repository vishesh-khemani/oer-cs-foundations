import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TMTest {
    @Test
    public void testBinaryIncrementer() {
        // Define states.
        TM.State scanRight = new TM.State(); // start state
        TM.State flipBits = new TM.State();
        TM.State scanLeft = new TM.State();
        TM.State accept = new TM.State();

        // Define transitions.
        scanRight.addTransition('0', scanRight, '0', Tape.Direction.R);
        scanRight.addTransition('1', scanRight, '1', Tape.Direction.R);
        scanRight.addTransition(Tape.EMPTY_SYMBOL, flipBits, Tape.EMPTY_SYMBOL, Tape.Direction.L);
        flipBits.addTransition('1', flipBits, '0', Tape.Direction.L);
        flipBits.addTransition('0', scanLeft, '1', Tape.Direction.L);
        flipBits.addTransition(Tape.EMPTY_SYMBOL, scanLeft, '1', Tape.Direction.L);
        scanLeft.addTransition('0', scanLeft, '0', Tape.Direction.L);
        scanLeft.addTransition('1', scanLeft, '1', Tape.Direction.L);
        scanLeft.addTransition(Tape.EMPTY_SYMBOL, accept, Tape.EMPTY_SYMBOL, Tape.Direction.R);

        // Construct TM.
        TM tm = new TM(scanRight);
        tm.addAcceptState(accept);

        // Verify incrementing.
        Tape tape = new Tape("0");
        assertTrue(tm.run(tape));
        assertEquals("1", tape.toString());
        assertEquals('1', tape.readSymbol());
        assertTrue(tm.run(tape));
        assertEquals("10", tape.toString());
        assertEquals('1', tape.readSymbol());
        assertTrue(tm.run(tape));
        assertEquals("11", tape.toString());
        assertEquals('1', tape.readSymbol());
        assertTrue(tm.run(tape));
        assertEquals("100", tape.toString());
        assertEquals('1', tape.readSymbol());
    }
}
