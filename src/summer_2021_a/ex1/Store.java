package summer_2021_a.ex1;

public class Store {
    private Tablet[] tablets;
    private int[] systems;

    public Store() {
        tablets = new Tablet[1000];
        systems = new int[3];
    }

    public boolean addTablet(Tablet tablet) {
        //if tablets full return false (section 1)
        if (this.tablets[this.tablets.length - 1] != null)
            return false;

        int i = 0;
        while (this.tablets[i] != null) {
            //if the tablet already exist in the tablets arr then update the price with the higher price and return true
            //(section 2)
            if (this.tablets[i].isSame(tablet)) {
                this.tablets[i].setPrice(Math.max(this.tablets[i].getPrice(), tablet.getPrice()));
                return true;
            }
            i++;
        }

        //if tablet doesn't exist just add him (section 3)
        this.tablets[i] = tablet;
        return true;
    }

    public int sortStore() {
        //could be better but whatever

        Tablet[] copy = new Tablet[1000];
        int[] copySystems = new int[3];
        char[] chars = {'W', 'A', 'I'};
        int copyIndex=0;
        for (int i = 0; i < 3; i++) {
            int j = 0;
            while (this.tablets[j] != null) {
                if(this.tablets[j].getSystem()==chars[i]){
                    copySystems[i]++;
                    copy[copyIndex++] = this.tablets[j];
                }
            }
        }
        this.tablets=copy;
        this.systems=copySystems;
        return 1000-copyIndex;
    }
}
