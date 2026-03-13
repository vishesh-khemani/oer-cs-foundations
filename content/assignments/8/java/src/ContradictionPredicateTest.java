import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.Duration;

import org.junit.Test;

public class ContradictionPredicateTest {
    @Test
    public void testHaltingDeciderFalse() {
        // Create a HaltingDecider that always returns false.
        HaltingDecider decider = new HaltingDecider(false);

        // Create the ContradictionPredicate.
        ContradictionPredicate contradictionPredicate = new ContradictionPredicate(decider, TIMEOUT);
        String input = "some input";

        // Verify that the HaltingDecider's prediction is that contradictionPredicate
        // does not halt on input.
        boolean willHalt = decider.halts(contradictionPredicate, input);
        assertFalse(willHalt);

        // Evaluate contradictionPredicate on input and verify that it actually halts
        // i.e. returns before the timeout.
        long startTime = System.currentTimeMillis();
        contradictionPredicate.test(input);
        long elapsedTime = System.currentTimeMillis() - startTime;
        assertTrue(elapsedTime < 0.5 * TIMEOUT.toMillis());

        // The contradiction is established.
    }

    @Test
    public void testHaltingDeciderTrue() {
        // Create a HaltingDecider that always returns true.
        HaltingDecider decider = new HaltingDecider(true);

        // Create the ContradictionPredicate.
        ContradictionPredicate contradictionPredicate = new ContradictionPredicate(decider, TIMEOUT);
        String input = "some input";

        // Verify that the HaltingDecider's prediction is that contradictionPredicate
        // halts on input.
        boolean willHalt = decider.halts(contradictionPredicate, input);
        assertTrue(willHalt);

        // Evaluate contradictionPredicate on input and verify that it actually doesn't
        // halt i.e. returns after the timeout.
        long startTime = System.currentTimeMillis();
        contradictionPredicate.test(input);
        long elapsedTime = System.currentTimeMillis() - startTime;
        assertTrue(elapsedTime > 0.8 * TIMEOUT.toMillis());

        // The contradiction is established.
    }

    private static final Duration TIMEOUT = Duration.ofSeconds(5);
}
