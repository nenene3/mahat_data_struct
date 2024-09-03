package aviv_2023_b;

import data_Structs.Queue;
import helpers.QueueHelper;

public class Ex1 {
    public static void main(String[] args) {
        Queue<Integer> que = QueueHelper.createQue(new Integer[]{80,90,100,-1,75,96,-1,100,100,97,96,-1,-1,88,94,-1});

        Queue<Integer> tests = arrangeData(que);
        System.out.println(que);
        System.out.println(tests);
    }
    public static Queue<Integer> arrangeData(Queue<Integer> marks){
        Queue<Integer> tests= new Queue<>();
        Queue<Integer> tmp= new Queue<>();
        int counter=0;
        while(!marks.isEmpty()){
            if(marks.head()==-1){
                tests.insert(counter);
                counter=0;
                marks.remove();
            }else{
                counter++;
                tmp.insert(marks.remove());
            }
        }
        while (!tmp.isEmpty())
            marks.insert(tmp.remove());

        return tests;
    }
}
