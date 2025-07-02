package intro;

import java.util.ArrayList;
import java.util.List;

public class Pairs {
    public static List<List<String>> pairs(List<String> elements) {
        List<List<String>> result = new ArrayList<>();

        for (int i = 0; i < elements.size(); i++) {
            for (int j = i + 1; j < elements.size(); j++) {
                result.add(List.of(elements.get(i), elements.get(j)));
            }
        }
        return result;
    }
}
