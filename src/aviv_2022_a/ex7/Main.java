package aviv_2022_a.ex7;

public class Main {
    public static void main(String[] args) {
        TStack a =new TStack();
    }

    public static void maximum(TStack tStack){
        tStack.move(0,1);
        while(!tStack.isEmpty(0)){
            if(tStack.bigOrEqual(1,0)){
                tStack.move(0,1);
                tStack.move(1,2);
            }else{
                tStack.move(1,2);
                tStack.move(0,1);
            }
        }
    }
    public static void sort(TStack stack){
        while(!stack.isEmpty(0)){
            maximum(stack);
            while(!stack.isEmpty(2)){
                stack.move(2,0);
            }
        }
    }
}
