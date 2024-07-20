package summer_2023_b;

import data_Structs.Stack;
import helpers.StackHelper;

public class Ex5 {
    public static void main(String[] args) {
//        Stack<Integer> head= StackHelper.createStack(new Integer[]{7,3,10,12,21,12,3,13,15,3,18});
        Stack<Integer> head= StackHelper.createStack(new Integer[]{1,2,3,4,5,6,7,8,9,1});
        System.out.println(firstPlace(head,81));
        System.out.println(lastPlace(head,81));
        System.out.println(minDis(head));
    }
    public static int firstPlace(Stack<Integer> stk,int num){
        Stack<Integer> tmp = new Stack<>();
        int counter=1;
        while(!stk.isEmpty() && num!=stk.top()){
            tmp.push(stk.pop());
            counter++;
        }
        int ret = stk.isEmpty() ? -1 : counter;

        while(!tmp.isEmpty())
            stk.push(tmp.pop());
        return ret;
    }
    public static int lastPlace(Stack<Integer> stk,int num){
        int ret=-1;
        Stack<Integer> tmp = new Stack<>();
        int counter=1;
        while(!stk.isEmpty()){
            if(stk.top()==num)
                ret=counter;
            tmp.push(stk.pop());
            counter++;
        }
        while(!tmp.isEmpty())
            stk.push(tmp.pop());

        return ret;
    }


    public static int minDis(Stack<Integer> stk){
        if(stk.isEmpty())
            return -1;
        Stack<Integer> tmp = new Stack<>();
        int min=lastPlace(stk,stk.top())-firstPlace(stk,stk.top())-1;
        while(!stk.isEmpty()){
            int first =firstPlace(stk,stk.top());
            int last =lastPlace(stk,stk.top());
            if(last!=first)
                min=Math.min(min,last-first-1);
            tmp.push(stk.pop());
        }
        while (!tmp.isEmpty())
            stk.push(tmp.pop());
        return min;
    }
}
