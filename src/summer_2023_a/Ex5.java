package summer_2023_a;

import data_Structs.Node;
import helpers.NodeCreator;

public class Ex5 {
    public static void main(String[] args) {
        Node<Integer> head = NodeCreator.arrToNode(new Integer[]{100, 40, 20, 100, 100, 20, 30, 20, 20});

        System.out.println(mostPopularNumber(head));
    }

    public static void buildFreqList(Node<Integer> chain) {
        while (chain != null) {
            Node<Integer> current = chain.getNext();
            Node<Integer> prev = chain;
            int find = chain.getValue();
            int counter = 1;
            while (current != null) {
                if (current.getValue() == find) {
                    prev.setNext(current.getNext());
                    counter++;
                } else {
                    prev = current;
                }
                current = current.getNext();
            }
            chain.setNext(new Node<>(counter, chain.getNext()));
            chain=chain.getNext().getNext();
        }

    }
    public static int mostPopularNumber(Node<Integer> chain){
        buildFreqList(chain);
        int occurrence=0;
        int number=0;
        while(chain!=null){
            if(occurrence<chain.getNext().getValue()){
                occurrence=chain.getNext().getValue();
                number=chain.getValue();
            }
            chain=chain.getNext().getNext();
        }

        return number;
    }
}
