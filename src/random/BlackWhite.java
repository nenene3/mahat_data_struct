package random;

import data_Structs.BinNode;

public class BlackWhite {
    public static void main(String[] args) {
        BinNode<Character> head = new BinNode<>('c');

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
