package recursion;

import java.util.List;

public class SumOfLengths {
    public static int sumOfLengths(List<String> strings) {

        return sum(strings, 0);
    }

    private static int sum(List<String> strings, int index) {
        if (index >= strings.size()) {
            return 0;
        }

        return strings.get(index).length() + sum(strings, index + 1);
    }
}
