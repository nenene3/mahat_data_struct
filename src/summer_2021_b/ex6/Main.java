package summer_2021_b.ex6;

import data_Structs.Node;
import helpers.NodeCreator;

public class Main {

    public static void main(String[] args) {
        Node<Double> head = NodeCreator.arrToNode(new Double[]{2.2,0.9,199990.9,0.9,0.9,0.9,0.9,0.9,0.9,0.9,0.9,2.2});
        ForeignCurrency foreignCurrency = new ForeignCurrency("a",head);
//        foreignCurrency.addRate(2.2);
        Node<Double> d = foreignCurrency.getRates();
        NodeCreator.printNode(d);
        System.out.println(foreignCurrency.isWorthInvesting());
    }
}
