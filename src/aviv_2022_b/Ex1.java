package aviv_2022_b;

import data_Structs.Stack;
import helpers.StackHelper;

public class Ex1 {
    public static void main(String[] args) {
        Stack<Integer> stack = StackHelper.createStack(new Integer[]{18, 3, 15, 13, 4, 25, 21, 12, 10, 22, 7});
        System.out.println(equalsUms(stack));
    }

    public static boolean equalsUms(Stack<Integer> stack) {
        int len = 0;
        Stack<Integer> tmp = new Stack<>();

        while (!stack.isEmpty()) {
            tmp.push(stack.pop());
            len++;
        }

        if (len % 2 == 0)
            return false;

        for (int i = 0; i < len / 2; i++)
            stack.push(tmp.pop());
        int middle = tmp.pop();

        while (!stack.isEmpty()) {
            System.out.println(stack.top() + " + " + tmp.top() + " = " + middle);
            if (stack.pop() + tmp.pop() != middle) {
                return false;
            }
        }

        return true;
    }
}
