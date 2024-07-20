package summer_2021_a.ex5;

public class Main {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        A ab = new B();
        a.f();
        ab.f();
        b.f();
        a.g();
        ab.g();
        b.g();
        ((B)(ab)).superG();
        b.superG();
        ((B)a).superG();
    }
}
