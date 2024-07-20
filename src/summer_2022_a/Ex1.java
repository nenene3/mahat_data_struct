package summer_2022_a;

import data_Structs.Node;
import helpers.NodeCreator;

public class Ex1 {
    public static void main(String[] args) {
        Node<Integer> head = NodeCreator.arrToNode(new Integer[]{5, 20, 9, 6, 5, 8, 2});
//        NodeCreator.printNode(differenceList(head));
        System.out.println(theSurvives(head));
    }

    public static Node<Integer> differenceList(Node<Integer> head) {
        if (head == null)
            return null;
        if (!head.hasNext())
            return head;
        Node<Integer> dummy = new Node<>(0);
        Node<Integer> running = dummy;
        while (head.hasNext()) {
            running.setNext(new Node<>(Math.abs(head.getValue()-head.getNext().getValue())));
            head=head.getNext();
            running=running.getNext();
        }
        return dummy.getNext();
    }
    public static int theSurvives(Node<Integer> head){
        if(head==null)
            return -1;
        while(head.hasNext()){
            NodeCreator.printNode(head);
            head=differenceList(head);
        }
        System.out.println(head.getValue());

        return head.getValue() ==null ? -1 : head.getValue();
    }
}
