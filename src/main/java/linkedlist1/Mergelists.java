package linkedlist1;

public class Mergelists {
    public static Node<Integer> mergeLists(Node<Integer> head1, Node<Integer> head2) {
        Node<Integer> dummyNode = new Node<>(null);
        Node<Integer> current1 = head1;
        Node<Integer> current2 = head2;
        Node<Integer> previous = dummyNode;

        while (current1 != null && current2 != null) {
            if (current1.val <= current2.val) {
                previous.next = current1;
                current1 = current1.next;
            } else {
                previous.next = current2;
                current2 = current2.next;
            }
            previous = previous.next;
        }

        if (current1 != null) {
            previous.next = current1;
        }
         if (current2 != null) {
             previous.next = current2;
         }

        return dummyNode.next;
    }


    public static Node<Integer> mergeLists_recursive(Node<Integer> head1, Node<Integer> head2) {
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }

        if (head1.val <= head2.val) {
            head1.next = mergeLists_recursive(head1.next, head2);
            return head1;
        } else {
            head2.next = mergeLists_recursive(head1, head2.next);
            return head2;
        }
    }
}
