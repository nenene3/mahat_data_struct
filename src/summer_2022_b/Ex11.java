package summer_2022_b;

import data_Structs.BinNode;

public class Ex11 {
    public static void main(String[] args) {
        BinNode<Character> bDD100H = new BinNode<>('b');
        bDD100H.setLeft(new BinNode<>('w'));
        bDD100H.setRight(new BinNode<>('w'));
        bDD100H.getLeft().setLeft(new BinNode<>('b'));
        bDD100H.getLeft().setRight(new BinNode<>('b'));
        bDD100H.getRight().setRight(new BinNode<>('b'));
        bDD100H.getRight().setLeft(new BinNode<>('b'));
        System.out.println("IsBlueAndWhite = " + isBlackWhite(bDD100H));
    }

    public static boolean isBlackWhite(BinNode<Character> head) {
        if (head == null)
            return true;

        if (!head.hasLeft() && !head.hasRight())
            return head.getValue() == 'b';

        if (head.getValue() != 'w' && head.getValue() != 'b')
            return false;

        if (head.getValue() == 'b') {
            if (!head.hasLeft() || !head.hasRight())
                return false;

            if (head.getLeft().getValue() != 'w')
                return false;

            if (head.getRight().getValue() != 'w')
                return false;
        }

        return isBlackWhite(head.getLeft()) && isBlackWhite(head.getRight());
    }
}
