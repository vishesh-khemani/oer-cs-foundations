import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class EmailDFATest {
    @Test
    public void testEmailDFA() {
        // Construct the DFA
        DFA dfa = new DFA();

        // TODO: define the states.

        // TODO: set the start state.

        // TODO: set the accept states.

        // TODO: define state transitions.

        // Test invalid emails.
        for (String input : new String[] { "@@b.com", "a@b.co", "a@b.comm", "@b.com", "a@.com" }) {
            assertFalse(dfa.accepts(input));
        }

        // Test valid emails.
        for (String input : new String[] { "a@b.com", "ab@ab.com", "b@a.com" }) {
            assertTrue(dfa.accepts(input));
        }
    }
}