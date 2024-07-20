package summer_2021_b;

import data_Structs.Queue;

public class Ex1 {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.insert(1);
        queue.insert(2);
        queue.insert(2);
        queue.insert(3);
        queue.insert(3);
        queue.insert(3);
        queue.insert(4);
        queue.insert(4);
        queue.insert(4);
        queue.insert(4);
        queue.insert(5);
        queue.insert(5);
        queue.insert(5);
        queue.insert(5);
        queue.insert(5);
//        System.out.println(queue);

        System.out.println(equalToStairRight(queue, 6));
    }

    public static Queue<Integer> stairs(int num) {
        if(num<0)
            return new Queue<>();

        Queue<Integer> ret = new Queue<>();
        for (int i = 1; i <= num; i++)
            for (int j = 0; j < i; j++)
                ret.insert(i);

        return ret;
    }


    public static boolean equalToStairRight(Queue<Integer> check, int num) {
        if (num <= 0)
            return check.isEmpty();

        if (check.isEmpty())
            return false;

        Queue<Integer> compare = stairs(num);

        System.out.println(compare);
        System.out.println(check);
        while (!compare.isEmpty() && !check.isEmpty())
            if (compare.remove() - check.remove() != 0)
                return false;

        return compare.isEmpty() && check.isEmpty();
    }
}

//public static boolean equalToStair(Queue<Integer> check) {
//    int find = 1;
//    int counter = 1;
//    boolean flag =false;
//
//    while (!check.isEmpty()) {
//        flag=false;
//        if (check.remove() != find)
//            return false;
//
//        counter--;
//        if (counter == 0) {
//            find++;
//            counter = find;
//            flag=true;
//        }
//    }
//    return flag;
//}