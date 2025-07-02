package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class IntersectionWithDupes {

    public static List<String> intersectionWithDupes(List<String> listA, List<String> listB) {
        HashMap<String, Integer> mapA = new HashMap<>();
        HashMap<String, Integer> mapB = new HashMap<>();
        List<String> intersection = new ArrayList<>();

        for (String item : listA) {
            mapA.merge(item, 1, Integer::sum);
        }

        for (String item : listB) {
            mapB.merge(item, 1, Integer::sum);
        }

        for (String item :  mapA.keySet()) {

            if (mapB.containsKey(item)) {
                int duplicateCount = Math.min(mapA.get(item), mapB.get(item));

                for (int i = 1; i <= duplicateCount; i++) {
                   intersection.add(item);
                }
            }
        }

        return intersection;
    }
}
