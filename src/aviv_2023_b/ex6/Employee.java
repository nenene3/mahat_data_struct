package aviv_2023_b.ex6;

public class Employee {
    private static int index = 1;
    private String name;
    private int num;

    public Employee(String name) {
        this.name = name;
        this.num = index++;
    }

    public static int getIndex() {
        return index;
    }

    public static void setIndex(int index) {
        Employee.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
