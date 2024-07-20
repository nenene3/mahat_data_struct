package summer_2021_a;


import data_Structs.Queue;

public class Ex2 {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.insert(2);
        queue.insert(5);
        queue.insert(5);
        queue.insert(7);
        queue.insert(7);
        queue.insert(7);
        queue.insert(2);
        queue.insert(4);
        queue.insert(1);
        queue.insert(3);
        queue.insert(2);
        queue.insert(5);
        queue.insert(5);
        queue.insert(1);

        System.out.println(dup(queue));
        System.out.println(queue.isEmpty());
    }

    public static Queue<Integer> dup(Queue<Integer> que) {
        Queue<Integer> ret = new Queue<>();

        Queue<Integer> tmp = new Queue<>();

        Queue<Integer> full;
        Queue<Integer> empty;
        int counter;
        while (!que.isEmpty() || !tmp.isEmpty()) {
            if (que.isEmpty()) {
                full = tmp;
                empty = que;
            } else {
                full = que;
                empty = tmp;
            }
            int find = full.remove();
            counter = 1;
            while (!full.isEmpty()) {
                if (full.head() == find) {
                    counter++;
                    full.remove();
                } else {
                    empty.insert(full.remove());
                }
            }
            if (counter > 2) {
                ret.insert(find);
            }
        }
        return ret;
    }

}
