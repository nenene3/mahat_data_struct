package summer_2021_b;

import data_Structs.Node;
import helpers.NodeCreator;

public class Ex2 {
    public static void main(String[] args) {
        Node<Integer> aee = NodeCreator.arrToNode(new Integer[]{1, 1, 2, 4, 8, 16, 32});
        Node<Integer> rev = NodeCreator.arrToNode(new Integer[]{8,4,4});
        System.out.println(sumChainRev(rev));
    }
    public static boolean sumChain(Node<Integer> head){
        int sum= head.getValue();
        head=head.getNext();
        while(head!=null){
            System.out.println("sum: "+sum+" head: "+head);
            if(sum!= head.getValue())
                return false;
            sum+= head.getValue();
            head=head.getNext();
        }
        return true;
    }

    public static boolean sumChainRev(Node<Integer> head){
        if(head==null || !head.hasNext())
            return true;

        int sum = head.getValue();
        head=head.getNext();
        while (head.hasNext()){
            System.out.println(head.getValue()+"     "+sum/2);
            if(sum/2!= head.getValue())
                return false;
            sum= head.getValue();
            head=head.getNext();
        }
        return head.getValue()==sum;
    }
}
