package aviv_2022_a.ex4;

public class Main {
    public static void main(String[] args) {

        A one = new B(127, 1.4);
        A two = new A(613);
        boolean bool = false;
        //1
        // bool = one.goodCode();
        //2
        //bool = two.goodCode();
        //3
        //bool = ((B) one).goodCode();
        //4
        //bool =((B)two).goodCode();

        System.out.println(bool);
        two.func();
        two.func();
        two.func();
        one.func();
        one.func();
        System.out.println(A.countA);
        System.out.println(A.countB);
    }
}
