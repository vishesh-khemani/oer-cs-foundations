import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class EmailNFATest {
    @Test
    public void testEmailNFA() {
        // Construct the NFA
        NFA nfa = new NFA();

        // TODO: define the states.

        // TODO: set the start state.

        // TODO: set the accept states.

        // TODO: define state transitions.

        // Test invalid emails.
        for (String input : new String[] { "@@b.com", "a@b.co", "a@b.comm", "@b.com", "a@.com" }) {
            assertFalse(nfa.accepts(input));
        }

        // Test valid emails.
        for (String input : new String[] { "a@b.com", "ab@ab.com", "b@a.com" }) {
            assertTrue(nfa.accepts(input));
        }
    }
}
