package summer_2021_a.ex6;

public class Program {
    public static void main(String[] args) {
        System.out.println("************");
        Apple a1 = new Apple(10);
        Object a2 = new Apple(10);
        Banana b1 = new Banana(10);
        Object b2 = new Banana(10);

        //1 valid print: 10
        // System.out.println(a1.getWeight());

        //2 runtime error
        // System.out.println (((Banana)a2).getWeight());

        //3 false the function take the default equals(Object obj)
        //  System.out.println (a1.equals(a2));

        //4 false the override doesn't take place because object don't recognize apple other so it takes the (Object obj)
        //System.out.println (a2.equals(a1));

        //5 true
        // System.out.println (b1.equals(b2));

        //6 true
        //System.out.println (b2.equals(b1));

        //7 false
        //System.out.println (a1.equals((Banana)b2));

        //8 ture
        //System.out.println (a1.equals((Apple)a2));

        //9 false
        // System.out.println (b1.equals((Apple)a2));

        //10 runtime error
        // System.out.println (b1.equals((Banana)a2));
    }
}
