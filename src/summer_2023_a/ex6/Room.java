package summer_2023_a.ex6;

public class Room {
    private int num;
    private int beds;
    private double price;


    public Room(int num, int beds, double price) {
        this.num = num;
        this.beds = beds;
        this.price = price;
    }
    public int time(){
        return this.beds*5;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getBeds() {
        return beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
