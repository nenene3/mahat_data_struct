package summer_2023_b;

import data_Structs.BinNode;

public class Ex7 {
    public static void main(String[] args) {
        BinNode<Integer> head=new BinNode<>(new BinNode<>(10),70,new BinNode<>(51));
        head.getLeft().setLeft(new BinNode<>(1));
        head.getLeft().setRight(new BinNode<>(7));
        head.getRight().setRight(new BinNode<>(212));
        head.getRight().getRight().setLeft(new BinNode<>(22));
        head.getRight().getRight().setRight(new BinNode<>(17));
        System.out.println(isSpecial(head));
    }

    public static boolean isSpecial(BinNode<Integer> head) {
        if (head == null)
            return true;

        if (head.hasLeft() && head.hasRight())
            if (helper(head.getLeft(), head.getRight()))
                return false;

        return isSpecial(head.getLeft()) && isSpecial(head.getRight());
    }

    public static boolean helper(BinNode<Integer> left, BinNode<Integer> right) {
        if (left == null)
            return false;

        if(search(left.getValue(), right))
            return true;

        return   helper(left.getLeft(), right) || helper(left.getRight(), right);
    }

    //if num found return true
    public static boolean search(int num, BinNode<Integer> right) {
        if (right == null) {
            return false;
        }
        if (right.getValue() == num)
            return true;

        return search(num, right.getLeft()) || search(num, right.getRight());
    }

}
