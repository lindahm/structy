package recursion;

public class PalindromRecursive {

    public static boolean palindrome(String s) {
        return isPalindrome(s, 0, s.length() - 1);
    }

    private static boolean isPalindrome(String s, int start, int end) {
        if (start >= end) {
            return true;
        }

        return s.charAt(start) == s.charAt(end) && isPalindrome(s, start + 1, end - 1);
    }
}
