package summer_2022_a.ex7;

import data_Structs.BinNode;

public class Main {
    public static void main(String[] args) {

        BinNode<Integer> root = new BinNode<>(3);
        root.setLeft(new BinNode<>(3));
        root.getLeft().setLeft(new BinNode<>(1));
        root.getLeft().setRight(new BinNode<>(3));
        root.getLeft().getRight().setRight(new BinNode<>(2));

        root.setRight(new BinNode<>(10));
        root.getRight().setLeft(new BinNode<>(9));
        root.getRight().getLeft().setLeft(new BinNode<>(7));

        root.getRight().setRight(new BinNode<>(7));
        root.getRight().getRight().setRight(new BinNode<>(10));
        what1(root);
    }

    public static void what1(BinNode<Integer> bt) {
        if (bt != null) {
            int x = bt.getValue();
            if (what2(bt.getLeft(), x) && what2(bt.getRight(), x))
                System.out.println(x);
            what1(bt.getLeft());
            what1(bt.getRight());
        }
    }

    public static boolean what2(BinNode<Integer> bt, int x) {
        if (bt == null) return true;
        if (bt.getValue() == x) return false;
        return what2(bt.getLeft(), x) && what2(bt.getRight(), x);
    }
}
