package hashing;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Write a method, allUnique, that takes in an list.
 * The method should return a boolean indicating whether or not the list contains unique items.
 * */
public class AllUnique {

    public static boolean allUnique(List<String> items) {
        Set<String> previousItems = new HashSet<>();

        for (String item : items) {
            if (previousItems.contains(item)) {
                return false;
            }
            previousItems.add(item);
        }
        return true;
    }
}
