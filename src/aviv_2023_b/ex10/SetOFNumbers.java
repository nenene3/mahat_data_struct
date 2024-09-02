package aviv_2023_b.ex10;

import data_Structs.Node;

public class SetOFNumbers {

    private Node<Integer> head;


    public SetOFNumbers() {
        this.head = null;
    }

    public void addToSet(int num) {
        if (this.head == null) {
            this.head = new Node<>(num);
            return;
        }
        Node<Integer> current = this.head;
        while (current.hasNext()) {
            if (current.getValue() == num)
                return;
            current = current.getNext();
        }
        if (current.getValue() == num)
            return;

        current.setNext(new Node<>(num));
    }

    public int getMax() {
        if(head==null)
            throw new RuntimeException("setOfNumber empty");

        int max = this.head.getValue();
        Node<Integer> current = this.head;
        while (current != null) {
            max = Math.max(current.getValue(), max);
            current = current.getNext();
        }

        return max;
    }
    public int getMin(){
        int min=-1;
        while(!this.isEmpty()){
            min=this.getMax();
            this.removeFromSet(min);
        }
        return min;
    }

    public void removeFromSet(int num) {
        if (this.head == null)
            return;
        if (this.head.getValue() == num) {
            this.head = head.getNext();
            return;
        }
        Node<Integer> current = this.head;
        Node<Integer> prev = this.head;
        while (current != null) {
            if (current.getValue() == num) {
                prev.setNext(current.getNext());
                return;
            }
            prev = current;
            current = current.getNext();
        }
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public boolean isSame(SetOFNumbers other){
        int num1=0;
        int num2=0;
        while(!other.isEmpty() && !this.isEmpty()){
            num1=this.getMax();
            num2=this.getMax();
            if(num1!=num2)
                return false;

            this.removeFromSet(num1);
            other.removeFromSet(num1);
        }

        return other.isEmpty() && this.isEmpty();
    }

    @Override
    public String toString() {
        StringBuilder a = new StringBuilder();
        a.append("[");
        Node<Integer> current = this.head;
        while(current !=null){
            a.append(current.getValue()).append(",");
            current=current.getNext();
        }
        a.append("]");
        return a.toString();
    }
}
