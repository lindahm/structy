package linkedlist1;

public class LinkedListFind {
    public static <T> boolean linkedListFind(Node<T> head, T target) {
        Node<T> current = head;

        while (current != null) {
            if (current.val.equals(target)) {
                return true;
            }
            current = current.next;
        }

        return false;
    }

    public static <T> boolean linkedListFind_recursive(Node<T> head, T target) {
        if (head == null) {
            return false;
        }

        return head.val.equals(target) || linkedListFind_recursive(head.next, target);
    }

}
