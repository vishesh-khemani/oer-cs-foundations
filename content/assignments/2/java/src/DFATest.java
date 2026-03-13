import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DFATest {

    @Test
    public void testTurnstyleDFA() {
        // Construct the DFA
        DFA dfa = new DFA();

        // Define the states.
        DFA.State locked = new DFA.State();
        DFA.State unlocked = new DFA.State();

        // Set the start state.
        dfa.setStartState(locked);

        // Set the accept states.
        dfa.addAcceptState(locked);

        // Define state transitions.
        locked.addTransition('T', unlocked);
        locked.addTransition('P', locked);
        unlocked.addTransition('T', unlocked);
        unlocked.addTransition('P', locked);

        // Test rejected inputs.
        for (String input : new String[] { "T", "TT", "PTPPT" }) {
            assertFalse(dfa.accepts(input));
        }

        // Test accepted inputs.
        for (String input : new String[] { "TP", "PPTPTPPP", "P" }) {
            assertTrue(dfa.accepts(input));
        }
    }

}