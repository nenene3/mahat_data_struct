package aviv_2022_a.ex10;

public class ManageDay {
    private AdvertHour[] twentyFourHours;

    public ManageDay(AdvertHour[] twentyFourHours) {
        this.twentyFourHours = twentyFourHours;
    }

    public AdvertHour[] getTwentyFourHours() {
        return twentyFourHours;
    }

    public void setTwentyFourHours(AdvertHour[] twentyFourHours) {
        this.twentyFourHours = twentyFourHours;
    }
    public double benefitDay(){
        double sum=0;
        for(int i=0;i<24;i++)
            for(int j=0;j<15;j++)
                if(this.twentyFourHours[i].getArr()[j]!=null)
                    sum+=this.twentyFourHours[i].getArr()[j].getPrice();

        return sum;
    }

}
