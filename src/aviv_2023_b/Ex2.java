package aviv_2023_b;

import data_Structs.Node;
import helpers.NodeCreator;

public class Ex2 {
    public static void main(String[] args) {
        Node<Integer> a = NodeCreator.arrToNode(new Integer[]{1,2,3,4,-10,1});
        balance(a);
        NodeCreator.printNode(a);
    }
    public static void balance(Node<Integer> head){
        if(head==null)
            return;

        int counter=0;
        int sum=0;
        Node<Integer> prev=head;

        while(head!=null){
            sum+= head.getValue();
            counter++;
            prev=head;
            head=head.getNext();
        }

        if(sum!=0){
            prev.setNext(new Node<>(-sum));
            prev=prev.getNext();
            counter++;
        }
        if(counter%2==1)
            prev.setNext(new Node<>(0));
    }
}
