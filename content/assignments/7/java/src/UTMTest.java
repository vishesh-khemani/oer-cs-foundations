import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UTMTest {

    @Test
    public void testBinaryIncrementer() {
        String tmSpec = """
                stateDiagram-v2
                    [*] --> scanRight
                    scanRight --> scanRight : 0->0,R|1->1,R
                    scanRight --> flipBits : ⊔->⊔,L
                    flipBits --> flipBits : 1->0,L
                    flipBits --> scanLeft : 0->1,L
                    flipBits --> scanLeft : ⊔->1,L
                    scanLeft --> scanLeft : 0->0,L|1->1,L
                    scanLeft --> accept : ⊔->⊔,R
                    accept --> [*]
                """;

        Tape tape = new Tape("0");
        assertTrue(utm.run(tmSpec, tape));
        assertEquals("1", tape.toString());
        assertEquals('1', tape.readSymbol());

        assertTrue(utm.run(tmSpec, tape));
        assertEquals("10", tape.toString());
        assertEquals('1', tape.readSymbol());

        assertTrue(utm.run(tmSpec, tape));
        assertEquals("11", tape.toString());
        assertEquals('1', tape.readSymbol());

        assertTrue(utm.run(tmSpec, tape));
        assertEquals("100", tape.toString());
        assertEquals('1', tape.readSymbol());
    }

    private final UTM utm = new UTM();
}
