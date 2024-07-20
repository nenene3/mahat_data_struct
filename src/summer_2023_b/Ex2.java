package summer_2023_b;

import data_Structs.Node;
import helpers.NodeCreator;

public class Ex2 {
    public static void main(String[] args) {
        Node<Integer> head = NodeCreator.arrToNode(new Integer[]{10, 20, 5, 7, 8, 4, 6, 11, 7});
        Node<Integer> sp = split(head);
        NodeCreator.printNode(head);
        NodeCreator.printNode(sp);
    }

    public static Node<Integer> split(Node<Integer> head) {
        if (head == null)
            return null;
        Node<Integer> dummy = new Node<>(0);
        Node<Integer> running = dummy;
        Node<Integer> prev = head;
        int find = (head.getValue() + 1) % 2;
        while (head != null) {
            if (head.getValue() % 2 == find) {
                running.setNext(head);
                running = running.getNext();
                prev.setNext(head.getNext());
            } else {
                prev = head;
            }
            head = head.getNext();
        }
        running.setNext(null);
        return dummy.getNext();
    }
}
