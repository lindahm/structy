package intro;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static List<Object> fizzBuzz(int n) {
        List<Object> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("fizzbuzz");

            } else if (i % 3 == 0) {
                result.add("fizz");

            } else if (i % 5 == 0) {
                result.add("buzz");

            } else {
                result.add(i);
            }
        }
        return result;
    }
}
