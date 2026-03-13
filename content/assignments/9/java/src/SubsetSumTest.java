import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class SubsetSumTest {

    private static class TestSubsetter extends Subsetter<Integer> {
        TestSubsetter(Map<List<Integer>, Set<List<Integer>>> setToSubsets) {
            this.setToSubsets = setToSubsets;
        }

        @Override
        public Set<List<Integer>> generateAllSubsets(ArrayList<Integer> items) {
            return setToSubsets.get(items);
        }

        private final Map<List<Integer>, Set<List<Integer>>> setToSubsets;
    }

    @Test
    public void testSolutionExists() {
        SubsetSum subsetSum = new SubsetSum(new ArrayList<>(Arrays.asList(3, 6, 3)), 6);
        TestSubsetter subsetter = new TestSubsetter(Map.of(
                subsetSum.getNumbers(), Set.of(
                        List.of(), List.of(3), List.of(6), List.of(3, 3), List.of(3, 6),
                        List.of(3, 3, 6))));
        List<Integer> subset = subsetSum.solve(subsetter);
        assertNotNull(subset);
        assertTrue(subsetSum.verify(subset));
        assertTrue(subset.equals(List.of(3, 3)) || subset.equals(List.of(6)));
        assertTrue(subsetSum.verify(List.of(3, 3)));
        assertTrue(subsetSum.verify(List.of(6)));
        assertFalse(subsetSum.verify(List.of(3, 3, 6)));
    }

    @Test
    public void testSolutionDoesNotExist() {
        SubsetSum subsetSum = new SubsetSum(new ArrayList<>(Arrays.asList(1, 4)), 2);
        TestSubsetter subsetter = new TestSubsetter(Map.of(
                subsetSum.getNumbers(), Set.of(
                        List.of(), List.of(1), List.of(4), List.of(1, 4))));
        List<Integer> subset = subsetSum.solve(subsetter);
        assertNull(subset);
        assertFalse(subsetSum.verify(List.of(1, 1)));
        assertFalse(subsetSum.verify(List.of(2)));
    }

}
