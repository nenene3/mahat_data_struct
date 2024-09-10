package aviv_2022_a.ex7;

import data_Structs.Stack;

public class TStack {
    private Stack<Integer>[] stack;

    public TStack() {
        this.stack = new Stack[3];
        for(int i=0;i<3;i++)
            this.stack[i]=new Stack<>();
    }

    public boolean isEmpty(int pos) {
        if (pos < 0 || 2 < pos)
            return true;

        return this.stack[pos].isEmpty();
    }

    public boolean bigOrEqual(int from, int toCompare) {
        if (from < 0 || 2 < from)
            return false;
        if (toCompare < 0 || 2 < toCompare)
            return false;

        int f = stack[from].top();
        int c = stack[toCompare].top();

        return f >= c;
    }

    public void move(int from, int to) {
        if (from == 0 && to == 1) {
            stack[0].push(stack[1].pop());
        }
        if (from == 1 && to == 2) {
            stack[1].push(stack[2].pop());
        }
        if (from == 2 && to == 0) {
            stack[2].push(stack[0].pop());
        }
    }

}
