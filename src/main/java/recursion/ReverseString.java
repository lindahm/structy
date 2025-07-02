package recursion;

public class ReverseString {
    public static String reverseString(String s) {
        return reverse(s, 0);
    }

    private static String reverse(String s, int index) {
        if (index >= s.length()) {
            return "";
        }

        return reverse(s, index + 1) + s.charAt(index);
    }
}
