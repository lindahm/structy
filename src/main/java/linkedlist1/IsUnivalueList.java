package linkedlist1;

public class IsUnivalueList {
    public static <T> boolean isUnivalueList(Node<T> head) {
        T reference = head.val;
        Node<T> current = head.next;

        while (current != null) {
            if (!current.val.equals(reference)) {
                return false;
            }
            current = current.next;
        }

        return true;
    }

    public static <T> boolean isUnivalueList_recursive(Node<T> head) {
        return isSameValue(head.val, head.next);
    }

    private static <T> boolean isSameValue(T reference, Node<T> head) {
        if (head == null) {
            return true;
        }

        return head.val.equals(reference) && isSameValue(reference, head.next);
    }
}
