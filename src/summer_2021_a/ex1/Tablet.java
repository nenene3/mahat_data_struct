package summer_2021_a.ex1;

public class Tablet {

    private String name;
    private String kind;
    private char system;
    private double size;
    private double price;

    public Tablet(String name,String kind,char size,double price ){
//        System.out.println("created");
        this.name=name;
        this.kind=kind;
        this.size=size;
        this.price=price;
    }

    public char getSystem() {
        return system;
    }

    public double getSize() {
        return size;
    }

    public String getKind() {
        return kind;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setSystem(char system) {
        this.system = system;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString(){

        return "aaaaaa";
    }

    //check if the name kind and size are equals
    public boolean isSame(Tablet other){
        return this.name.equals(other.name) && this.kind.equals(other.kind) && this.size == other.size;
    }
}
