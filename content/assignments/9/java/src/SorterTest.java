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

public class SorterTest {

    private static class TestPermuter<T> extends Permuter<T> {
        TestPermuter(Map<List<T>, Set<List<T>>> itemsToPermutations) {
            this.itemsToPermutations = itemsToPermutations;
        }

        @Override
        public Set<List<T>> generateAllPermutations(List<T> items) {
            return itemsToPermutations.get(items);
        }

        private final Map<List<T>, Set<List<T>>> itemsToPermutations;
    }

    @Test
    public void testVerifier() {
        Sorter<Integer> sorter = new Sorter<>(new ArrayList<>(Arrays.asList(3, 6, 3, 2)));
        assertTrue(sorter.verify(List.of(2, 3, 3, 6)));
        assertFalse(sorter.verify(List.of(3, 2, 3, 6)));
        assertFalse(sorter.verify(List.of(2, 3, 3)));
        assertFalse(sorter.verify(List.of(2, 3, 3, 6, 8)));
    }

    @Test
    public void testBruteForce() {
        Sorter<Integer> sorter = new Sorter<>(new ArrayList<>(Arrays.asList(3, 6, 3, 2)));
        TestPermuter<Integer> permuter = new TestPermuter<>(Map.of(
                sorter.getItems(), Set.of(
                        List.of(2, 3, 3, 6), List.of(2, 3, 6, 3), List.of(2, 6, 3, 3),
                        List.of(6, 2, 3, 3), List.of(6, 3, 2, 3), List.of(6, 3, 3, 2),
                        List.of(3, 2, 3, 6), List.of(3, 2, 6, 3), List.of(3, 6, 2, 3),
                        List.of(3, 6, 3, 2), List.of(3, 3, 2, 6), List.of(3, 3, 6, 2))));
        List<Integer> sorted = sorter.bruteForceSort(permuter);
        assertTrue(sorter.verify(sorted));
        assertTrue(sorted.equals(List.of(2, 3, 3, 6)));
    }

    @Test
    public void testInsertionSort() {
        Sorter<Integer> sorter = new Sorter<>(new ArrayList<>(Arrays.asList(3, 6, 3, 2)));
        List<Integer> sorted = sorter.insertionSort();
        assertTrue(sorter.verify(sorted));
        assertTrue(sorted.equals(List.of(2, 3, 3, 6)));
    }

}
