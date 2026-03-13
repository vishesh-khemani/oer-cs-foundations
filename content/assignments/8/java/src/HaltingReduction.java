import java.util.function.Predicate;

public class HaltingReduction {
    public HaltingReduction(ReturnsTrueDecider decider) {
        this.decider = decider;
    }

    public static Predicate<String> createReductionPredicate(Predicate<String> predicate, String input) {
        // TODO: implement the reduction logic here.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /** Reduces the halting problem to the returns-true problem. */
    public boolean halts(Predicate<String> predicate, String input) {
        return decider.alwaysReturnsTrue(createReductionPredicate(predicate, input), input);
    }

    private final ReturnsTrueDecider decider;
}