package hashing;

import java.util.HashMap;
import java.util.Map;

/**
 * Write a method, anagrams, that takes in two strings as arguments. The method should return
 * a boolean indicating whether or not the strings are anagrams. Anagrams are strings that
 * contain the same characters, but in any order.
 * */
public class Anagrams {

    public static boolean anagrams(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        Map<Character, Integer> charFrequency = new HashMap<>();

        for (Character c : s1.toCharArray()) {
            charFrequency.merge(c, 1, Integer::sum);
        }

        for (Character c : s2.toCharArray()) {
            Integer count = charFrequency.get(c);
            if (count == null) {
                return false;
            } else if (count == 1) {
                charFrequency.remove(c);
            } else {
                charFrequency.put(c, count - 1);
            }
        }

        return charFrequency.isEmpty();
    }
}
