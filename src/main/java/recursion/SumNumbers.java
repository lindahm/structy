package recursion;

import java.util.List;

public class SumNumbers {

    public static int sumNumbersRecursive(List<Integer> numbers) {
        return sum(numbers, 0);
    }

    private static int sum(List<Integer> numbers, int index) {
        if (index >= numbers.size()) {
            return 0;
        }
        return numbers.get(index) + sum(numbers, index + 1);
    }

}
