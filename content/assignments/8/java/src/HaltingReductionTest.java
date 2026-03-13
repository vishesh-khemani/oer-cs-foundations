import static org.junit.Assert.assertTrue;

import java.time.Duration;
import java.util.function.Predicate;

import org.junit.Test;

public class HaltingReductionTest {
    @Test
    public void testCreateReductionPredicateOnHaltingPredicate() {
        // A predicate that always halts and returns true.
        Predicate<String> halting = s -> true;
        String input = "test input";

        // The reduction predicate should halt and return true.
        Predicate<String> reductionPredicate = HaltingReduction.createReductionPredicate(halting, input);
        long startTime = System.currentTimeMillis();
        boolean returnedTrue = reductionPredicate.test(input);
        long elapsedTime = System.currentTimeMillis() - startTime;
        assertTrue(elapsedTime < 0.5 * TIMEOUT.toMillis());
        assertTrue(returnedTrue);
    }

    @Test
    public void testCreateReductionPredicateOnNonHaltingPredicate() {
        // A predicate that never halts (up to the timeout for tests).
        Predicate<String> nonHalting = s -> {
            try {
                Thread.sleep(TIMEOUT.toMillis());
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            return false;
        };
        String input = "test input";

        // The reduction predicate should not halt within the timeout.
        Predicate<String> reductionPredicate = HaltingReduction.createReductionPredicate(nonHalting, input);
        long startTime = System.currentTimeMillis();
        reductionPredicate.test(input);
        long elapsedTime = System.currentTimeMillis() - startTime;
        assertTrue(elapsedTime > 0.8 * TIMEOUT.toMillis());
    }

    private static final Duration TIMEOUT = Duration.ofSeconds(5);
}
