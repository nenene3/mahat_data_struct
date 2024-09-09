package summer_2021_a.ex8;

import data_Structs.Node;

public class IntList {
    private Node<Integer> head;

    public IntList() {
        head = null;
    }

    public void add(int a) {
        head = new Node<Integer>(a, head);
    }

    public String toString() {
        String s = "{";
        Node<Integer> h = head;
        while (h.getNext() != null) {
            s += h.getValue() + ",";
            h = h.getNext();
        }
        return s + h.getValue() + "}";
    }

    public boolean what1(IntList list) {
        Node<Integer> h1 = head;
        Node<Integer> h2 = list.head;
        while ((h1 != null) && (h2 != null)) {
            if (h1.getValue() != h2.getValue())
                return false;
            h1 = h1.getNext();
            h2 = h2.getNext();
        }
        return true;
    }

    public boolean what2(IntList list) {
        Node<Integer> h1 = head;
        while (h1 != null) {
            boolean found = false;
            Node<Integer> h2 = list.head;
            while ((h2 != null) && (!found)) {
                if (h1.getValue() == h2.getValue())
                    found = true;
                h2 = h2.getNext();
            }
            if (!found)
                return false;
            h1 = h1.getNext();
        }
        return true;
    }
}

