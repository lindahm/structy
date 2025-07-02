package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PairProduct {
    public static List<Integer> pairProduct(List<Integer> numbers, int target) {
        Map<Integer, Integer> numberIndices = new HashMap<>();

        for (int i = 0; i < numbers.size(); i++) {
            Integer number = numbers.get(i);
            Integer complement = target / number;

            if (numberIndices.containsKey(complement)) {
                return List.of(numberIndices.get(complement), i);
            }
            numberIndices.put(number, i);
        }
        return new ArrayList<>();
    }
}
