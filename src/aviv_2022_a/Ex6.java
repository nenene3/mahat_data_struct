package aviv_2022_a;

import data_Structs.Node;
import helpers.NodeCreator;

public class Ex6 {
    public static void main(String[] args) {
        Node<Integer> a = NodeCreator.arrToNode(new Integer[]{93,-1});
        Node<Double> n = avg(a);
        print(a);
    }
    public static Node<Double> avg(Node<Integer> head){
        int counter=0;
        double sum=0;
        Node<Double> dummy =new Node<>(0.0);
        Node<Double> running =dummy;
        while(head!=null){
            if(head.getValue()==-1){
                extracted(counter, sum, running);
                running=running.getNext();
                counter=0;
                sum=0;
            }else{
                counter++;
                sum+= head.getValue();
            }
            head=head.getNext();
        }
        return  dummy.getNext();
    }

    private static void extracted(int counter, double sum, Node<Double> running) {
        if(counter <=0 || sum <=0){
            running.setNext(new Node<>(0.0));
        }else{
         running.setNext(new Node<>(sum / counter));
        }
    }

    public static void print(Node<Integer> lst){
        if(lst==null)
            return;
        Node<Double> before = avg(lst);
        int counter=0;
        double sum=0;
        int min= lst.getValue();
        Node<Double> dummy =new Node<>(0.0);
        Node<Double> running =dummy;
        while(lst!=null){
            if(lst.getValue()==-1){
                if(counter!=1){
                    counter-=1;
                    sum-=min;
                }
                extracted(counter, sum, running);
                running=running.getNext();
                counter=0;
                sum=0;
                if(lst.hasNext()){
                    min=lst.getNext().getValue();
                }
            }else{
                counter++;
                sum+= lst.getValue();
                min=Math.min(min, lst.getValue());
            }
            lst=lst.getNext();
        }
        dummy=dummy.getNext();
        while(before!=null){
            System.out.println(before+"     "+dummy);
            dummy=dummy.getNext();
            before=before.getNext();
        }
    }
}
