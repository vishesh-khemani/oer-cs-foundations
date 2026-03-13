import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LockDFATest {
    @Test
    public void testLockDFA() {
        // Construct the DFA
        DFA dfa = new DFA();

        // TODO: define the states.

        // TODO: set the start state.

        // TODO: set the accept states.

        // TODO: define state transitions.

        // Test invalid combos.
        for (String input : new String[] { "LRLR", "LR", "RLR", "LRRL", "LRLLRL", "", "LRLRL" }) {
            assertFalse(dfa.accepts(input));
        }

        // Test valid combos.
        for (String input : new String[] { "LRL", "LLRL", "RLRL" }) {
            assertTrue(dfa.accepts(input));
        }
    }
}