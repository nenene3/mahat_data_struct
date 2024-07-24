package aviv_2023_b.ex4.section_b;

public class Circle extends Point{

    private int radius;

    public Circle(int x,int radius){
        super(x);
        this.radius=radius;
    }
    public String toString(){
        return super.toString() + " radius = "+this.radius;
    }
}
