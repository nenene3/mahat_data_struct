package aviv_2023_b.ex4;

public class Main {
    public static void main(String[] args) {
        Three x1 = new One();
        Two x2 = (Two) (new One());
        Two x3 = new Four();
        One x4 = new Four();
    }
}
