package summer_2021_a.ex9;

public class Supervisor extends Doctor {
    private Employee[] arr;
    private int current;

    public Supervisor(String name, String spe) {
        super(name, spe);
        this.current = 0;
        this.arr = new Employee[10];
    }
}
