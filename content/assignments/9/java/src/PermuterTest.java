import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class PermuterTest {

    @Test
    public void testNoItems() {
        Permuter<Integer> permutationsGenerator = new Permuter<>();
        ArrayList<Integer> items = new ArrayList<>();
        Set<List<Integer>> permutations = permutationsGenerator.generateAllPermutations(items);
        assertTrue(permutations.isEmpty());
    }

    @Test
    public void testOneItem() {
        Permuter<Integer> permutationsGenerator = new Permuter<>();
        ArrayList<Integer> items = new ArrayList<>();
        items.add(6);
        Set<List<Integer>> permutations = permutationsGenerator.generateAllPermutations(items);
        assertEquals(1, permutations.size());
        assertTrue(permutations.contains(List.of(6)));
    }

    @Test
    public void testTwoItems() {
        Permuter<Integer> permutationsGenerator = new Permuter<>();
        ArrayList<Integer> items = new ArrayList<>();
        items.add(6);
        items.add(42);
        Set<List<Integer>> permutations = permutationsGenerator.generateAllPermutations(items);
        assertEquals(2, permutations.size());
        assertTrue(permutations.contains(List.of(6, 42)));
        assertTrue(permutations.contains(List.of(42, 6)));
    }

    @Test
    public void testThreeItems() {
        Permuter<Integer> permutationsGenerator = new Permuter<>();
        ArrayList<Integer> items = new ArrayList<>(Arrays.asList(6, 42, 3));
        Set<List<Integer>> permutations = permutationsGenerator.generateAllPermutations(items);
        assertEquals(6, permutations.size());
        assertTrue(permutations.contains(List.of(6, 42, 3)));
        assertTrue(permutations.contains(List.of(6, 3, 42)));
        assertTrue(permutations.contains(List.of(42, 6, 3)));
        assertTrue(permutations.contains(List.of(42, 3, 6)));
        assertTrue(permutations.contains(List.of(3, 6, 42)));
        assertTrue(permutations.contains(List.of(3, 42, 6)));
    }

    @Test
    public void testDuplicates() {
        Permuter<Integer> permutationsGenerator = new Permuter<>();
        ArrayList<Integer> items = new ArrayList<>(Arrays.asList(6, 42, 6));
        Set<List<Integer>> permutations = permutationsGenerator.generateAllPermutations(items);
        assertEquals(3, permutations.size());
        assertTrue(permutations.contains(List.of(6, 42, 6)));
        assertTrue(permutations.contains(List.of(6, 6, 42)));
        assertTrue(permutations.contains(List.of(42, 6, 6)));
    }
}