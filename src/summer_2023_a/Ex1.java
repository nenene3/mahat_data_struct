package summer_2023_a;

import data_Structs.Queue;
import helpers.QueueHelper;

public class Ex1 {
    public static void main(String[] args) {
        Queue<Integer> que = QueueHelper.createQue(new Integer[]{7,2,5,4,6,8,10,12});
        System.out.println(que);
        moveToFront(que,5);
    }

    public static int putInPlace(Queue<Integer> que, int num) {
        Queue<Integer> tmpLower = new Queue<>();
        Queue<Integer> tmpHigher = new Queue<>();
        int counter = 1;
        while (!que.isEmpty()) {
            if (num < que.head()) {
                tmpHigher.insert(que.remove());
            } else {
                tmpLower.insert(que.remove());
                counter++;
            }
        }

        while (!tmpLower.isEmpty())
            que.insert(tmpLower.remove());

        que.insert(num);
        while (!tmpHigher.isEmpty())
            que.insert(tmpHigher.remove());

        return counter;
    }

    public static void moveToFront(Queue<Integer> q, int k) {
        Queue<Integer> tmp = new Queue<>();
        int counter=0;
        while(!q.isEmpty()){
            tmp.insert(q.remove());
            counter++;
        }
        Queue<Integer> moveToBack= new Queue<>();
        for(int i=0;i<counter-k ;i++){
            moveToBack.insert(tmp.remove());
        }
        while(!tmp.isEmpty())
            q.insert(tmp.remove());
        while(!moveToBack.isEmpty())
            q.insert(moveToBack.remove());
        System.out.println(q);
    }
}
