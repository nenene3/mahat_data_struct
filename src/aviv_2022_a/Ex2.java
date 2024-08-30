package aviv_2022_a;

import data_Structs.Stack;
import helpers.StackHelper;

public class Ex2 {
    public static void main(String[] args) {
        Stack<Integer> stack = StackHelper.createStack(new Integer[]{6,12,2,10,7,5});
        avg(stack);
        System.out.println(stack);
    }

    public static void avg(Stack<Integer> stack) {
        if (stack.isEmpty())
            return;

        Stack<Integer> tmp = new Stack<>();
        int counter = 0;
        int sum = 0;
        while (!stack.isEmpty()) {
            counter++;
            sum += stack.top();
            tmp.push(stack.pop());
        }

        int average = sum / counter;
        System.out.println(average);
        Stack<Integer> aboveAvg = new Stack<>();


        while (!tmp.isEmpty()) {
            if (tmp.top() > average) {
                aboveAvg.push(tmp.pop());
            } else
                stack.push(tmp.pop());
        }
        while(!aboveAvg.isEmpty())
            stack.push(aboveAvg.pop());

    }
}
