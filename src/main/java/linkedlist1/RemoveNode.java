package linkedlist1;

public class RemoveNode {
    public static <T> Node<T> removeNode(Node<T> head, T targetVal) {
        Node<T> dummyNode = new Node<>(null);
        dummyNode.next = head;
        Node<T> previous = dummyNode;
        Node<T> current = head;

        while (current != null) {
            if (current.val.equals(targetVal)) {
                previous.next = current.next;
                return dummyNode.next;
            }
            previous = current;
            current = current.next;
        }
        return dummyNode.next;
    }


    public static <T> Node<T> removeNode_recursive(Node<T> head, T targetVal) {
        if (head == null) {
            return null;
        }

        if (head.val == targetVal) {
            return head.next;
        }

        head.next = removeNode_recursive(head.next, targetVal);
        return head;
    }
}
