import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sorter<T extends Comparable<T>> {

    public Sorter(ArrayList<T> items) {
        this.items = items;
        this.itemToCount = new HashMap<>();
        for (T item : items) {
            itemToCount.put(item, itemToCount.getOrDefault(item, 0) + 1);
        }
    }

    /**
     * Solves the sorting problem by examining each permutation of items until one
     * is in sorted order.
     */
    public List<T> bruteForceSort(Permuter<T> permuter) {
        // TODO: implement
        throw new UnsupportedOperationException();
    }

    /**
     * Returns whether the solution is indeed a sorted version of items.
     */
    public boolean verify(List<T> solution) {
        // TODO: implement
        throw new UnsupportedOperationException();
    }

    /**
     * Solves the sorting problem by using insertion sort.
     */
    public List<T> insertionSort() {
        // TODO: implement
        throw new UnsupportedOperationException();
    }

    public List<T> getItems() {
        return Collections.unmodifiableList(items);
    }

    private final ArrayList<T> items;
    private final Map<T, Integer> itemToCount;
}
