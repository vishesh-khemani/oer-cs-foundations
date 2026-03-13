import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubsetSum {

    public SubsetSum(ArrayList<Integer> numbers, int target) {
        this.numbers = numbers;
        this.target = target;
    }

    /**
     * Solves the subset-sum problem by returning a subset that sums up to the
     * target (or null if no solution exists).
     */
    public List<Integer> solve(Subsetter<Integer> subsetter) {
        // TODO: implement
        throw new UnsupportedOperationException();
    }

    /**
     * Returns whether the solution is indeed a subset of numbers and sums up to the
     * target.
     */
    public boolean verify(List<Integer> solution) {
        // TODO: implement
        throw new UnsupportedOperationException();
    }

    public List<Integer> getNumbers() {
        return Collections.unmodifiableList(this.numbers);
    }

    public int getTarget() {
        return target;
    }

    private final ArrayList<Integer> numbers;
    private final int target;
}
