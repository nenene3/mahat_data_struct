package aviv_2022_b;

import data_Structs.Node;
import helpers.NodeCreator;

public class Ex2 {
    public static void main(String[] args) {
        Node<Integer> head = NodeCreator.arrToNode(new Integer[]{2, 3, 2, 1, -4, 1, 0});
        System.out.println(isSection(head));
    }

    public static int numNodesFollowing(Node<Integer> head) {
        int counter = 0;

        while (head != null) {
            head = head.getNext();
            counter++;
        }

        return counter;
    }

    public static boolean isSection(Node<Integer> head) {
        if (head == null)
            return true;

        int len = numNodesFollowing(head.getNext());

        while (head != null)
            if (head.getValue() > len)
                return false;
            else {
                head = head.getNext();
                len--;
            }

        return true;
    }

}
