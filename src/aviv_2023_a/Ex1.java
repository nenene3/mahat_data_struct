package aviv_2023_a;

import data_Structs.Queue;
import helpers.QueueHelper;

public class Ex1 {
    public static void main(String[] args) {
        Queue<Integer> marks = QueueHelper.createQue(new Integer[]{80, 90, 100, 75, 96, 100, 100, 97, 96, 88, 94});
        Queue<Integer> tests = QueueHelper.createQue(new Integer[]{3, 2, 4, 2});
        System.out.println(averageQue(marks, tests));
    }

    public static Queue<Double> averageQue(Queue<Integer> marks, Queue<Integer> tests) {
        Queue<Double> avg = new Queue<>();
        Queue<Integer> tmpTests = new Queue<>();

        while (!tests.isEmpty()) {
            double sum = 0;
            for (int i = 0; i < tests.head(); i++) {
                sum += marks.head();
                marks.insert(marks.remove());
            }
            if (sum == 0 || tests.head() == 0) {
                avg.insert(0.0);
            } else {
                avg.insert(sum / tests.head());
            }
            tmpTests.insert(tests.remove());
        }

        while (!tmpTests.isEmpty())
            tests.insert(tmpTests.remove());

        return avg;
    }
}
