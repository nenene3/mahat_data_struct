package helpers;

import data_Structs.Queue;

public class QueueHelper {

    public static <T> Queue<T> createQue(T[] arr){
        Queue<T> ret = new Queue<>();
        for (T t : arr) ret.insert(t);
        return ret;
    }
}
