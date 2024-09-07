package summer_2022_a;

import data_Structs.Stack;
import helpers.StackHelper;

public class Ex2 {
    public static void main(String[] args) {
        Stack<Integer> stack = StackHelper.createStack(new Integer[]{200, 100, 7, 4, 2, 0});
        System.out.println(stack.top());
        System.out.println(isUpper(stack));
    }

    public static boolean isUpper(Stack<Integer> stack) {

        int sum = stack.pop();
        while (!stack.isEmpty()) {
            System.out.println(stack.top());
            if (stack.top() <= sum)
                return false;
            sum += stack.pop();
        }

        return true;
    }
}
