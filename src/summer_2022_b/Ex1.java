package summer_2022_b;

import data_Structs.Stack;
import helpers.StackHelper;

public class Ex1 {
    public static void main(String[] args) {
        Stack<Integer> stack = StackHelper.createStack(new Integer[]{7,22,10,12,21,25,4,13,15,3,18});
        System.out.println(equalSums(stack));
    }
    public static boolean equalSums(Stack<Integer> stack){
        if(stack==null || stack.isEmpty())
            return true;

        Stack<Integer> tmp = new Stack<>();
        int len = 0;
        while(!stack.isEmpty()){
            tmp.push(stack.pop());
            len++;
        }
        if(len%2==0)
            return false;

        for(int i=0;i<len/2;i++)
            stack.push(tmp.pop());

        int sum= tmp.pop();

        while(!stack.isEmpty())
            if(stack.pop() + tmp.pop() != sum)
                return false;

        return true;
    }
}
