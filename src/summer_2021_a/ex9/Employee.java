package summer_2021_a.ex9;

public class Employee {
    private static int index;
    private String name;
    private int  num;

    public Employee(String name){
        this.name=name;
        this.num=1+index;
        index++;
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
