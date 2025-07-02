package hashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Intersection {
    public static List<Integer> intersection(List<Integer> listA, List<Integer> listB) {
        List<Integer> intersection = new ArrayList<>();
        Set<Integer> numbersListA = new HashSet<>(listA);

        for (Integer number : listB) {
            if (numbersListA.contains(number)) {
                intersection.add(number);
            }
        }
        return intersection;
    }
}
