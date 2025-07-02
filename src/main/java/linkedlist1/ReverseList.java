package linkedlist1;

public class ReverseList {

    public static <T> Node<T> reverseList(Node<T> head) {
        if (head == null) {
            return null;
        }

        Node<T> previous = head;
        Node<T> current = head.next;
        previous.next = null;

        while (current != null) {
            Node<T> next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }

    public static <T> Node<T> reverseList_recursive(Node<T> head) {
        return reverse(null, head);
    }

    private static <T> Node<T> reverse(Node<T> previous, Node<T> head) {
        if (head == null) {
            return previous;
        }

        Node<T> headNext = head.next;
        head.next = previous;
        return reverse(head, headNext);
    }
}
