package summer_2022_b;

import data_Structs.Node;
import helpers.NodeCreator;

public class Ex2 {
    public static void main(String[] args) {
        Node<Integer> head = NodeCreator.arrToNode(new Integer[]{2, 3, 2, 1, -4, 1, 0});
        System.out.println(numNodesFollowing(head));

        System.out.println(isSection(head));
    }

    public static int numNodesFollowing(Node<Integer> head) {
        if (head == null)
            return 0;

        int counter = 0;

        while (head != null) {
            head = head.getNext();
            counter++;
        }

        return counter - 1;
    }

    public static boolean isSection(Node<Integer> head) {
        int count = numNodesFollowing(head);

        while (head != null) {
            if (head.getValue() > count)
                return false;
            head = head.getNext();
            count--;
        }


        return true;
    }
}
