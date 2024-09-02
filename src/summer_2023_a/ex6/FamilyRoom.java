package summer_2023_a.ex6;

public class FamilyRoom extends Room{
    private boolean babyBed;
    private boolean balcony;

    public FamilyRoom(int num, int beds, double price, boolean babyBed, boolean balcony) {
        super(num, beds, price);
        this.babyBed = babyBed;
        this.balcony = balcony;
    }

    @Override
    public int time() {
        int all=10;
        if(this.babyBed)
            all+=5;
        if(this.balcony)
            all+=5;
        return super.time()+all;
    }

    public boolean isBabyBed() {
        return babyBed;
    }

    public void setBabyBed(boolean babyBed) {
        this.babyBed = babyBed;
    }

    public boolean isBalcony() {
        return balcony;
    }

    public void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }
}
