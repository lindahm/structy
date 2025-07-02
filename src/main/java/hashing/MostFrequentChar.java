package hashing;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MostFrequentChar {
    public static char mostFrequentChar(String s) {
        Map<Character, Integer> charFrequency = new LinkedHashMap<>();

        for (char c : s.toCharArray()) {
            charFrequency.merge(c, 1, Integer::sum);
        }

        char mostFrequentChar = s.charAt(0);
        for (Map.Entry<Character, Integer> currentFrequency : charFrequency.entrySet()) {
            if (currentFrequency.getValue()> charFrequency.get(mostFrequentChar)) {
                mostFrequentChar = currentFrequency.getKey();
            }
        }
        return mostFrequentChar;
    }
}
