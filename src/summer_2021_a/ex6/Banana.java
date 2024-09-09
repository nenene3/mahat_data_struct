package summer_2021_a.ex6;

public class Banana {
    private int weight;
    public Banana (int w) {
        weight = w;
    }
    public int getWeight () {
        return weight;
    }
    public boolean equals (Object other) {
        return ((other != null) &&
                (other instanceof Banana) &&
                (weight == ((Banana)other).weight));
    }
}
