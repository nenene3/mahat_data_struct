package summer_2022_a;

import data_Structs.Node;
import data_Structs.Queue;
import helpers.NodeCreator;
import helpers.QueueHelper;

public class Ex8 {
    public static void main(String[] args) {

        Queue<Integer> que = QueueHelper.createQue(new Integer[]{1, 4, 2});
        Queue<Integer> que1 = QueueHelper.createQue(new Integer[]{10, 7, 1, 3});
        Queue<Integer> que2 = QueueHelper.createQue(new Integer[]{9, 1, 8});
        System.out.println(lastVal(que));
        System.out.println(countNum(que));
        Node<Queue<Integer>> queueNode = NodeCreator.arrToNode(new Queue[]{que, que1, que2});
        System.out.println(ret(queueNode));
    }

    public static int countNum(Queue<Integer> que) {
        int sum = 0;
        Queue<Integer> tmp = new Queue<>();
        while (!que.isEmpty()) {
            sum += que.head();
            tmp.insert(que.remove());
        }

        while (!tmp.isEmpty())
            que.insert(tmp.remove());

        return sum;
    }

    public static int lastVal(Queue<Integer> que) {
        int last = que.head();
        Queue<Integer> tmp = new Queue<>();
        while (!que.isEmpty()) {
            last = que.head();
            tmp.insert(que.remove());
        }
        while (!tmp.isEmpty())
            que.insert(tmp.remove());
        return last;
    }

    public static Queue<Integer> ret(Node<Queue<Integer>> queueNode) {
        if (queueNode == null) {
            return null;
        }
        Queue<Integer> queue = new Queue<>();
        while(queueNode!=null){
            int add = queueNode.getValue().head()%2 == 1 ? countNum(queueNode.getValue()) : lastVal(queueNode.getValue());
            queue.insert(add);
            queueNode=queueNode.getNext();
        }
        return queue;
    }
}
