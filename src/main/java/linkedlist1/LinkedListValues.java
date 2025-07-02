package linkedlist1;

import java.util.ArrayList;
import java.util.List;

public class LinkedListValues {
    public static List<String> linkedListValues(Node<String> head) {
        Node<String> current = head;
        List<String> values = new ArrayList<>();

        while (current != null) {
            values.add(current.val);
            current = current.next;
        }

        return values;
    }
}
