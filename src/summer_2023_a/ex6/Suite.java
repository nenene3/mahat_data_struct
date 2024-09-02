package summer_2023_a.ex6;

public class Suite extends Room{
    private boolean jacuzzi;


    public Suite(int num, int beds, double price, boolean jacuzzi) {
        super(num, beds, price);
        this.jacuzzi = jacuzzi;
    }
    @Override
    public int time(){
        int all=35;
        if(this.jacuzzi)
            all+=20;


        return super.time()+all;
    }

    public boolean isJacuzzi() {
        return jacuzzi;
    }

    public void setJacuzzi(boolean jacuzzi) {
        this.jacuzzi = jacuzzi;
    }
}
