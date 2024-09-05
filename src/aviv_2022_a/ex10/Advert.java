package aviv_2022_a.ex10;

public class Advert {
    private int length;
    private String product;
    private String company;
    private double price;

    public Advert(int length, String product, String company, double price) {
        this.length = length;
        this.product = product;
        this.company = company;
        this.price = price;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
