package aviv_2023_b.ex4.section_b;

public class Cylinder extends Circle{

    private int height;

    public Cylinder(int x,int radius,int height){
        super(x,radius);
        this.height=height;

    }

    @Override
    public String toString() {
        return super.toString() + " height ="+this.height;
    }
}
