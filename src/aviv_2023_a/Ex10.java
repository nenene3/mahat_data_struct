package aviv_2023_a;

import data_Structs.Queue;
import data_Structs.Stack;
import helpers.QueueHelper;
import helpers.StackHelper;

public class Ex10 {
    public static void main(String[] args) {
        Stack<Integer> a1= StackHelper.createStack(new Integer[]{7,3,2});
        Stack<Integer> a2= StackHelper.createStack(new Integer[]{15,14,12,10,7});
        Stack<Integer> a3= StackHelper.createStack(new Integer[]{70,65,60,36,20,15});
        Stack<Integer> a4= StackHelper.createStack(new Integer[]{115,112,108,100,90,80,70});
        Stack<Integer> a5= StackHelper.createStack(new Integer[]{800,700,500,300,200,180,130,115});
        Queue<Stack<Integer>> que = QueueHelper.createQue(new Stack[]{a1,a2,a3,a4,a5});
        System.out.println(isPerfect(que));
    }
    //not optimized
    public static boolean isPerfect(Queue<Stack<Integer>> q){
        int len= len_stk(q.head());
        int lastDigit= lastDigit(q.head());
        if(isUp3(q.head()))
            return false;
        q.remove();
        while(!q.isEmpty()){
            int lenTmp= len_stk(q.head());
            int lastDigitTmp= lastDigit(q.head());
            System.out.println(lastDigit + " "+q.head().top());
            if(isUp3(q.head()) || len>=lenTmp || q.head().top()!=lastDigit)
                return false;
            len=lenTmp;
            lastDigit=lastDigitTmp;
            q.remove();
        }

        return true;
    }

    public static int len_stk(Stack<Integer> stk){
        int counter=0;
        Stack<Integer> tmp = new Stack<>();
        while(!stk.isEmpty()){
            tmp.push(stk.pop());
            counter++;
        }
        while(!tmp.isEmpty()){
            stk.push(tmp.pop());
        }
        return counter;
    }
    public static int lastDigit(Stack<Integer> stk){

        int last=0;
        Stack<Integer> tmp = new Stack<>();
        while(!stk.isEmpty()){
            last=stk.top();
            tmp.push(stk.pop());
        }
        while(!tmp.isEmpty()){
            stk.push(tmp.pop());
        }
        return last;
    }
    public static boolean isUp3(Stack<Integer> stk){
        if(stk==null)
            return false;
        int last=0;
        boolean flag = true;
        Stack<Integer> tmp = new Stack<>();
        while(!stk.isEmpty() && flag){
            if(stk.top()<last)
                flag=false;
            last=stk.top();
            tmp.push(stk.pop());
        }

        while(!tmp.isEmpty()){
            stk.push(tmp.pop());
        }
        return !flag;
    }


}
