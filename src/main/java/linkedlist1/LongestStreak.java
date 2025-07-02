package linkedlist1;

public class LongestStreak {

    public static <T> int longestStreak(Node<T> head) {
        Integer max = 0;
        Integer currentStreak = 0;
        Node<T> current = head;
        T previousVal = null;

        while (current != null) {
            if (previousVal == null || previousVal.equals(current.val)) {
                currentStreak++;
            } else {
                currentStreak = 1;
            }

            previousVal = current.val;
            max = Math.max(currentStreak, max);
            current = current.next;
        }
        return max;
    }

}
