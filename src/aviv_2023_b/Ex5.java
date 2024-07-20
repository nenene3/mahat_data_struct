package aviv_2023_b;

import data_Structs.Node;
import helpers.NodeCreator;

public class Ex5 {
    public static void main(String[] args) {
        Node<Integer> head = NodeCreator.arrToNode(new Integer[]{1,3,6,13,27,300,600});
        NodeCreator.printNode(head);
        System.out.println(addToSuper(head,2700));
        NodeCreator.printNode(head);
    }

    public static boolean isSuper(Node<Integer> head){
        if(head==null)
            return true;

        int sum = head.getValue();
        head=head.getNext();
        while(head!=null){
            if(sum>=head.getValue())
                return false;
            sum+= head.getValue();
            head=head.getNext();
        }
        return true;
    }
    public static boolean addToSuper(Node<Integer> head,int add){
        Node<Integer> tmp =head;
        if(!isSuper(head))
            return false;

        Node<Integer> prev=head;
        while(head!= null && head.getValue()<add){
            prev=head;
            head=head.getNext();
        }
        prev.setNext(new Node<>(add,prev.getNext()));
        if(isSuper(tmp))
            return true;

        prev.setNext(prev.getNext().getNext());
        return false;
    }
}
