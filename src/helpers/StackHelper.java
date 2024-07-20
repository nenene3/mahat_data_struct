package helpers;

import data_Structs.Stack;

public class StackHelper {
    public static <T> Stack<T> createStack(T[] arr){
        Stack<T> ret = new Stack<>();
        for (T t : arr)
            ret.push(t);

        return ret;
    }
}
