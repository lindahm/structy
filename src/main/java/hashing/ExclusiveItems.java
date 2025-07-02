package hashing;

import java.util.*;

/**
 * Write a method, exclusiveItems, that takes in two lists, a,b, as arguments.
 * The method should return a new list containing elements that are in either list but not both lists.
 *
 * You may assume that each input list does not contain duplicate elements.
 * */
public class ExclusiveItems {

    public static List<Integer> intersection(List<Integer> listA, List<Integer> listB) {
        List<Integer> exclusiveNumbers = new ArrayList<>();
        Map<Integer, Boolean> isDuplicated = new HashMap<>();

        for (Integer number : listA) {
            isDuplicated.put(number, false);
        }

        for (Integer number : listB) {
            if (!isDuplicated.containsKey(number)) {
                exclusiveNumbers.add(number);
            } else {
                isDuplicated.put(number, true);
            }
        }

        for (Map.Entry<Integer, Boolean> entry : isDuplicated.entrySet()) {
            if (!entry.getValue()) {
                exclusiveNumbers.add(entry.getKey());
            }
        }
        return exclusiveNumbers;
    }
}
