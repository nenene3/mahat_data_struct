package summer_2021_a.ex3;

public class Shipping {
    private String address;
    private Object[] arr;

    public Shipping(){

    }
    public double sum(){
        double retSum=0.0;
        for (Object o : this.arr) {
            if (o == null)
                continue;
            retSum += o instanceof Book ? ((Book) o).getPrice() : ((Clothes) o).getPrice();
        }

        return  retSum;
    }
}
