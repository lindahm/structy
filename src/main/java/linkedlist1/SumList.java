package linkedlist1;

public class SumList {

    public static int sumList(Node<Integer> head) {
        Node<Integer> current = head;
        Integer sum = 0;

        while (current != null) {
            sum += current.val;
            current = current.next;
        }
        return sum;
    }

    public static int sumList_recursive(Node<Integer> head) {
        if (head == null) {
            return 0;
        }

        return head.val + sumList_recursive(head.next);
    }

}
