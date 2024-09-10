package aviv_2022_a.ex4;

public class A {
    public static int countA = 0;
    public static int countB = 0;
    private int myVal;
    protected String myString;

    public A() {
        myVal = 1;
    }

    public A(int val) {
        myVal = val;
        myString = "GOOD!";
    }

    public void func() {
        if(this instanceof B){
            countB++;
        }else{
            countA++;
        }
        System.out.println("YES");
    }
}
