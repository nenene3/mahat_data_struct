package aviv_2022_a.ex4;

public class B extends A {
    private double x;

    public B(int myVal,double x){
        super(myVal);
        this.x=x;
    }

    public boolean goodCode() {
        return x > 15.0;
    }
}