package linkedlist1;

public class GetNodeValue {

    public static <T> T getNodeValue(Node<T> head, int index) {
        Node<T> current = head;
        int i = 0;

        while (current != null) {
            if (i == index) {
                return current.val;
            }
            i++;
            current = current.next;
        }
        return null;
    }

    public static <T> T getNodeValue_recursive(Node<T> head, int index) {
        if (head == null) {
            return null;
        }
        if (index == 0) {
            return head.val;
        }

        return getNodeValue_recursive(head.next, index - 1);
    }

}
