package summer_2022_a.ex5;

import data_Structs.Stack;
import summer_2021_a.ex4.C;

public class Pyramid {
    //node would be easier
    private Stack<Clown> clownStack;

    public Pyramid() {
        this.clownStack = new Stack<Clown>();
    }

    public boolean isStable() {
        if (this.clownStack.isEmpty())
            return true;

        Stack<Clown> tmp = new Stack<>();

        Clown clown = this.clownStack.pop();
        tmp.push(clown);
        boolean flag = true;
        while (!this.clownStack.isEmpty() && flag) {
            if (this.clownStack.top().getWeight() <= clown.getWeight())
                flag = false;
            clown = this.clownStack.pop();
            tmp.push(clown);
        }
        while (!tmp.isEmpty())
            this.clownStack.push(tmp.pop());

        return flag;
    }

    public boolean addClown(Clown c) {

        if (!this.isStable())
            return false;

        Stack<Clown> tmp = new Stack<>();
        boolean hasFound = false;
        while (!this.clownStack.isEmpty()) {
            if (this.clownStack.top().getWeight() == c.getWeight()) {
                hasFound = true;
                break;
            }
            tmp.push(this.clownStack.pop());
        }
        if (hasFound) {
            while (!tmp.isEmpty()) {
                this.clownStack.push(tmp.pop());
            }
            return false;
        }

        while (!tmp.isEmpty()) {
            if (tmp.top().getWeight() < c.getWeight()) {
                clownStack.push(c);
                break;
            }
            clownStack.push(tmp.pop());
        }
        if (tmp.isEmpty()) {
            this.clownStack.push(c);
        }

        while (!tmp.isEmpty())
            clownStack.push(tmp.pop());

        return true;
    }
}
