package aviv_2022_a;

import data_Structs.Node;
import helpers.NodeCreator;

public class Ex1 {
    public static void main(String[] args) {
        Node<Integer> head = NodeCreator.arrToNode(new Integer[]{1,2,2});
        second(head);
        NodeCreator.printNode(head);
    }
    public static void first(Node<Integer> chain){
        while (chain!=null){
            chain.setNext(new Node<>(chain.getValue(),chain.getNext()));
            chain=chain.getNext().getNext();
        }
    }
    public static void second(Node<Integer> chain){

        if(chain==null)
            return;

        Node<Integer> dummy = new Node<>(0);
        Node<Integer> clone = dummy ;

        while(chain.hasNext()){
            clone.setNext(new Node<>(chain.getValue()));
            chain=chain.getNext();
            clone=clone.getNext();
        }
        clone.setNext(new Node<>(chain.getValue()));
        chain.setNext(dummy.getNext());
    }

}
