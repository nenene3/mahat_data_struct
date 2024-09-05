package aviv_2022_a.ex10;

public class AdvertHour {
    private Advert[] arr;

    public AdvertHour(Advert[] arr) {
        this.arr = arr;
    }

    public Advert[] getArr() {
        return arr;
    }

    public void setArr(Advert[] arr) {
        this.arr = arr;
    }

    public int freeTime() {
        int counter = 0;
        for (int i = 0; i < 15; i++) {
            if (this.arr[i] == null)
                break;
            counter += this.arr[i].getLength();
        }

        return (5 * 60) - counter;
    }

    public boolean isPossible(Advert add) {
        if (this.freeTime() - add.getLength() < 0)
            return false;

        return this.arr[this.arr.length - 1] != null;
    }

    public void addAdvert(Advert add) {
        if (!this.isPossible(add))
            return;
        for(int i=0;i<15;i++)
            if(arr[i]==null){
                arr[i]=add;
                break;
            }
    }

}
