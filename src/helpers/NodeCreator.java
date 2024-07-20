package helpers;

import data_Structs.Node;

public class NodeCreator {

    public static <T> Node<T> arrToNode(T[] arr) {
        Node<T> dummy = new Node<>(null);
        Node<T> running = dummy;
        for (T t : arr) {
            running.setNext(new Node<>(t));
            running = running.getNext();
        }
        return dummy.getNext();
    }
    public static <T> void printNode(Node<T> head){
        System.out.print("head --> [");
        while(head!=null){
            System.out.print(head+",");
            head=head.getNext();
        }
        System.out.println(" ]");
    }


}
