
import java.time.Duration;
import java.util.function.Predicate;

public class ContradictionPredicate implements Predicate<String> {

    /**
     * Constructs a predicate that uses the specified HaltingDecider and considers
     * any runtime longer than timeout to be an infinite loop.
     */
    public ContradictionPredicate(HaltingDecider decider, Duration timeout) {
        this.decider = decider;
        this.timeout = timeout;
    }

    @Override
    public boolean test(String s) {
        // TODO: Implement logic to use decider and timeout to contradict the decider's
        // prediction.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private final HaltingDecider decider;
    private final Duration timeout;
}