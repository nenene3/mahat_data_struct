package summer_2021_a.ex6;

public class Apple {
    private int weight;
    public Apple (int w) {
        weight = w;
    }
    public int getWeight () {
        return weight;
    }
    public boolean equals(Apple other) {
        System.out.println('a');
        return ((other!=null) &&
                (weight == other.weight));
    }
}
