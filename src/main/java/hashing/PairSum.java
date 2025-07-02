package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Write a method, pairSum, that takes in a List and a target sum as arguments.
 * The function should return a List containing a pair of indices whose elements sum to the given target.
 * The indices returned must be unique.
 *
 * Be sure to return the indices, not the elements themselves.
 *
 * There is guaranteed to be one such pair that sums to the target.
 * */
public class PairSum {
    public static List<Integer> pairSum(List<Integer> numbers, int target) {
        Map<Integer, Integer> numberIndices = new HashMap<>();

        for (int i = 0; i < numbers.size(); i++) {
            Integer number = numbers.get(i);
            Integer difference = target - number;

            if (numberIndices.containsKey(difference)) {
                return List.of(numberIndices.get(difference), i);
            }
            numberIndices.put(number, i);
        }
        return new ArrayList<>();
    }
}
