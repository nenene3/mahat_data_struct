package aviv_2023_a;

import data_Structs.Node;
import helpers.NodeCreator;

public class Ex5 {
    public static void main(String[] args) {
        Node<Integer> head = NodeCreator.arrToNode(new Integer[]{4, 9, 3, 7, 9, 9, 7, 7, 2, 9});
//        System.out.println(distance(head, 7));
        System.out.println(minDistanceValue(head));
    }

    public static int distance(Node<Integer> lst, int number) {
        int l = 0;
        int r = 0;
        while (lst != null && lst.getValue() != number) {
            lst = lst.getNext();
            l++;
        }
        while (lst != null) {
            r++;
            if (lst.getValue() == number)
                r = 0;
            lst = lst.getNext();
        }
        return l + r;
    }

    public static int minDistanceValue(Node<Integer> lst) {
        //?????????
        if(lst==null)
            return 0;

        int min = distance(lst, lst.getValue());
        int number= lst.getValue();
        Node<Integer> running = lst.getNext();
        while(running!=null){
            int dis=distance(lst,running.getValue());
            if(min>dis){
                number=running.getValue();
                min=dis;
            }
            running=running.getNext();
        }
        return number;
    }
}
