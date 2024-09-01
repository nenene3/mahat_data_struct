package summer_2023_b;

import data_Structs.Queue;
import helpers.QueueHelper;

public class Ex1 {
    public static void main(String[] args) {
//        System.out.println(strangers(23, 10));
        Queue<Integer> que = QueueHelper.createQue(new Integer[]{2, 10, 12, 3, 7, 4, 1});
        System.out.println(que);
        change(que, 9);
        System.out.println(que);
    }

    public static boolean strangers(int num1, int num2) {

        for (int i = Math.min(num1, num2); i > 1; i--)
            if (num1 % i == 0 && num2 % i == 0)
                return false;

        return true;
    }

    public static void change(Queue<Integer> que, int num) {
        Queue<Integer> stgQue = new Queue<>();
        Queue<Integer> notStgQue = new Queue<>();

        while (!que.isEmpty())
            if (strangers(que.head(), num)) {
                stgQue.insert(que.remove());
            } else {
                notStgQue.insert(que.remove());
            }

        while (!stgQue.isEmpty())
            que.insert(stgQue.remove());

        while (!notStgQue.isEmpty())
            que.insert(notStgQue.remove());
    }
}
