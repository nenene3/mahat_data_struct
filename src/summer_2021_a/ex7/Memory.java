package summer_2021_a.ex7;

import data_Structs.Node;

public class Memory {
    private Node<Data> start;

    public Memory(int totalSize) {
        this.start = new Node<Data>(new Data(totalSize));
    }

    public boolean isDanger() {
        Node<Data> current = this.start;
        int size = 0;
        int freeSize = 0;
        while (current != null) {
            if (current.getValue().isFree())
                freeSize += current.getValue().getSize();

            size += current.getValue().getSize();
            current = current.getNext();
        }

        return freeSize < size * 0.10;
    }
    public boolean bestFit(int num){
        if(this.isDanger())
            return false;

        Node<Data> current = this.start;

        while(current!=null){

            if(current.getValue().isFree() && current.getValue().getSize()>num){
                current.setNext(new Node<>(new Data(num),current.getNext()));
                current.getNext().getValue().setFree(false);
                current.getValue().setSize(current.getValue().getSize() - num);
                return true;
            } else if ( current.getValue().getSize()==num) {
                current.getValue().setFree(false);
                return true;
            }

            current=current.getNext();
        }

        return false;
    }

}
