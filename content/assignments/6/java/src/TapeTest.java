import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TapeTest {

    @Test
    public void testReadSymbol() {
        Tape tape = new Tape("abc");
        assertEquals('a', tape.readSymbol());
    }

    @Test
    public void testMove() {
        Tape tape = new Tape("abc");
        tape.move(Tape.Direction.L);
        assertEquals(Tape.EMPTY_SYMBOL, tape.readSymbol());
        tape.move(Tape.Direction.R);
        assertEquals('a', tape.readSymbol());
        tape.move(Tape.Direction.R);
        assertEquals('b', tape.readSymbol());
        tape.move(Tape.Direction.R);
        assertEquals('c', tape.readSymbol());
        tape.move(Tape.Direction.R);
        assertEquals(Tape.EMPTY_SYMBOL, tape.readSymbol());
        tape.move(Tape.Direction.L);
        assertEquals('c', tape.readSymbol());
    }

    @Test
    public void testWriteSymbol() {
        Tape tape = new Tape("abc");
        assertEquals('a', tape.readSymbol());
        tape.writeSymbol('A');
        assertEquals('A', tape.readSymbol());
        tape.move(Tape.Direction.R);
        assertEquals('b', tape.readSymbol());
        tape.move(Tape.Direction.L);
        assertEquals('A', tape.readSymbol());
    }

    @Test
    public void testToString() {
        Tape tape = new Tape("abc");
        assertEquals("abc", tape.toString());

        // Verify that the tape head didn't move.
        assertEquals('a', tape.readSymbol());

        // Move the tape head away from the start of the input, call toString and verify
        // that the tape head didn't move.
        tape.move(Tape.Direction.R);
        assertEquals('b', tape.readSymbol());
        assertEquals("abc", tape.toString());
        assertEquals('b', tape.readSymbol());

    }

    @Test
    public void testMultiple() {
        Tape tape = new Tape("01");
        tape.writeSymbol('1');
        tape.move(Tape.Direction.R);
        tape.writeSymbol('0');
        tape.move(Tape.Direction.R);

        assertEquals("10", tape.toString());

        assertEquals(Tape.EMPTY_SYMBOL, tape.readSymbol());
        tape.move(Tape.Direction.L);
        assertEquals('0', tape.readSymbol());
    }
}
