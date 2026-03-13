import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class SubsetterTest {

    @Test
    public void testExampleSubsets() {
        Subsetter<Integer> subsetter = new Subsetter<>();
        ArrayList<Integer> items = new ArrayList<>(Arrays.asList(6, 42, 3));
        Set<List<Integer>> subsets = subsetter.generateAllSubsets(items);
        assertTrue(subsets.remove(List.of()));
        assertTrue(subsets.remove(List.of(3)));
        assertTrue(subsets.remove(List.of(42)));
        assertTrue(subsets.remove(List.of(3, 42)));
        assertTrue(subsets.remove(List.of(6)));
        assertTrue(subsets.remove(List.of(3, 6)));
        assertTrue(subsets.remove(List.of(6, 42)));
        assertTrue(subsets.remove(List.of(3, 6, 42)));
        assertTrue(subsets.isEmpty());
    }

    @Test
    public void testSubsetsWithDuplicates() {
        Subsetter<Character> subsetter = new Subsetter<>();
        ArrayList<Character> items = new ArrayList<>(Arrays.asList('a', 'b', 'a', 'b'));
        Set<List<Character>> subsets = subsetter.generateAllSubsets(items);
        assertTrue(subsets.remove(List.of()));
        assertTrue(subsets.remove(List.of('b')));
        assertTrue(subsets.remove(List.of('a', 'b')));
        assertTrue(subsets.remove(List.of('b', 'b')));
        assertTrue(subsets.remove(List.of('a', 'b', 'b')));
        assertTrue(subsets.remove(List.of('a')));
        assertTrue(subsets.remove(List.of('a', 'a')));
        assertTrue(subsets.remove(List.of('a', 'a', 'b')));
        assertTrue(subsets.remove(List.of('a', 'a', 'b', 'b')));
        assertTrue(subsets.isEmpty());
    }
}