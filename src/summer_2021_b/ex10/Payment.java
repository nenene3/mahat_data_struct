package summer_2021_b.ex10;

public class Payment {

    private String name;
    private int num;
    private double fuel;


    public Payment(String name, int num, double fuel) {
        this.name = name;
        this.num = num;
        this.fuel = fuel;
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

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }
}
