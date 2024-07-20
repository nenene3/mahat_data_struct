package aviv_2023_a;

import data_Structs.Node;
import helpers.NodeCreator;

public class Ex2 {
    public static void main(String[] args) {
        Node<Integer> head1 = NodeCreator.arrToNode(new Integer[]{2, 3, 2, 1, 4, 1, 8});
        Node<Integer> head2 = NodeCreator.arrToNode(new Integer[]{2, 3, 2, 0, 4, 1, 8});
//        System.out.println(numDigits(head));
        System.out.println(compare(head1, head2));
    }

    public static int numDigits(Node<Integer> n) {
        int counter = 0;
        while (n != null) {
            counter++;
            n = n.getNext();
        }
        return counter;
    }

    public static int compare(Node<Integer> n1, Node<Integer> n2) {
        //you don't have to use numDigit to check, but it will make it easy
        int count1 = numDigits(n1);
        int count2 = numDigits(n2);
        if (count1 != count2)
            return count1 > count2 ? 1 : 2;

        while (n1 != null) {
            //integer can be converted to int don't worry about warning
            if (n1.getValue() != n2.getValue())
                return n1.getValue() > n2.getValue() ? 1 : 2;
            n1 = n1.getNext();
            n2 = n2.getNext();
        }

        return 0;
    }
}
