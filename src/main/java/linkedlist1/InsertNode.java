package linkedlist1;

public class InsertNode {
    public static <T> Node<T> insertNode(Node<T> head, T value, int index) {
        Node<T> dummyNode = new Node<>(null);
        dummyNode.next = head;
        Node<T> previous = dummyNode;
        Node<T> current = head;

        for (int i = 0; i < index; i++) {
            previous = current;
            current = current.next;
        }

            Node<T> newNode = new Node<>(value);
            newNode.next = previous.next;
            previous.next = newNode;

        return dummyNode.next;
    }

    public static <T> Node<T> insertNode_recursive(Node<T> head, T value, int index) {
           return insert(head, value, index, 0);
    }

    private static <T> Node<T> insert(Node<T> head, T value, int index, int i) {
        if (head == null) {
            return new Node<T>(value);
        }

        if (i == index) {
            Node<T> newNode = new Node<>(value);
            newNode.next = head;
            return newNode;
        }
        head.next = insert(head.next, value, index, i + 1);
        return head;
    }
}
