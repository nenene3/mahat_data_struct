package random;

import data_Structs.BinNode;

public class BlackWhite {
    public static void main(String[] args) {
        BinNode<Character> bDD100H = new BinNode<>('b');
        bDD100H.setLeft(new BinNode<>('w'));
        bDD100H.setRight(new BinNode<>('w'));
        bDD100H.getLeft().setLeft(new BinNode<>('b'));
        bDD100H.getLeft().setRight(new BinNode<>('b'));
        bDD100H.getRight().setRight(new BinNode<>('b'));
        bDD100H.getRight().setLeft(new BinNode<>('b'));
        System.out.println("IsBlueAndWhite 0 ? : " + isBlackWhite(bDD100H));
        System.out.println();
    }

    public static boolean isBlackWhite(BinNode<Character> head) {
        if (head == null)
            return true;
        if(head.getValue() !='w' && head.getValue() !='b' )
            return false;
        if (!head.hasLeft() && !head.hasRight())
            return head.getValue() == 'b';
        if (head.getValue() == 'b'){
            if(!head.hasLeft() || head.getLeft().getValue() !='w')
                return false;
            if(!head.hasRight() || head.getRight().getValue() !='w')
                return false;
        }

        return isBlackWhite(head.getLeft()) && isBlackWhite(head.getRight());
    }

}
