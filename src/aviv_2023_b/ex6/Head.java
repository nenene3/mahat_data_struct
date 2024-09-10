package aviv_2023_b.ex6;

public class Head extends Lecturer{
    private Employee[] arr;
    private int current;

    public Head(String name, String specialization, Employee[] arr, int current) {
        super(name, specialization);
        this.arr = arr;
        this.current = current;
    }

}
