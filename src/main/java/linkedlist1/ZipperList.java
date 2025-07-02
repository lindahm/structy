package linkedlist1;

public class ZipperList {

    public static <T> Node<T> zipperLists(Node<T> head1, Node<T> head2) {
        Node<T> dummyNode = new Node<>(null);
        Node<T> current1 = head1;
        Node<T> current2 = head2;
        Node<T> previous = dummyNode;

        while (current1 != null && current2 != null) {
            previous.next = current1;
            current1 = current1.next;

            previous.next.next = current2;
            current2 = current2.next;

            previous = previous.next.next;
        }

        if (current1 != null) {
            previous.next = current1;
        }
        if (current2 != null) {
            previous.next = current2;
        }

        return dummyNode.next;
    }

    public static <T> Node<T> zipperLists_recursive(Node<T> head1, Node<T> head2) {
            if (head1 == null) {
                return head2;
            }
            if (head2 == null) {
                return head1;
            }
            Node<T> head1Next = head1.next;
            Node<T> head2Next = head2.next;

            head1.next = head2;
            head2.next = zipperLists(head1Next, head2Next);

            return head1;
    }

}
