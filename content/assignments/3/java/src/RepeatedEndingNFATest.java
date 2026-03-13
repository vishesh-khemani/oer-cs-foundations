import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RepeatedEndingNFATest {
    @Test
    public void testRepeatedEndingNFA() {
        // Construct the NFA
        NFA nfa = new NFA();

        // TODO: define the states.

        // TODO: set the start state.

        // TODO: set the accept states.

        // TODO: define state transitions.

        // Test strings that should be rejected.
        for (String input : new String[] { "", "1", "00", "10", "001", "0100" }) {
            assertFalse(nfa.accepts(input));
        }

        // Test strings that should be accepted.
        for (String input : new String[] { "0", "010", "01010", "0101010" }) {
            assertTrue(nfa.accepts(input));
        }
    }
}