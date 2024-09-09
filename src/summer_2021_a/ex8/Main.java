package summer_2021_a.ex8;

public class Main {
    public static void main(String[] args) {
        IntList testList = new IntList();
        testList.add(2);
        testList.add(3);
        testList.add(6);
        testList.add(1);
        testList.add(4);
        System.out.println(testList);

        System.out.println("-------");
        //1 what1 == true && what2 == true
        IntList a = retList(new int[]{4,2,3,6,1,4});
        System.out.println(a);
        System.out.println(testList.what1(a));
        System.out.println(testList.what2(a));

        System.out.println("-------");

        //2 what1 == true && what2 == false
        IntList b = retList(new int[]{3,6,1,4});
        System.out.println(b);
        System.out.println(testList.what1(b));
        System.out.println(testList.what2(b));

        System.out.println("-------");

        //3 what1 == false && what2 == true
        IntList c = retList(new int[]{2,3,6,1,4,4,4,4,4});
        System.out.println(c);
        System.out.println(testList.what1(c));
        System.out.println(testList.what2(c));


        System.out.println("-------");

        //3 what1 == false && what2 == false
        IntList d = retList(new int[]{8,8,8,8,8,86,6});
        System.out.println(d);
        System.out.println(testList.what1(d));
        System.out.println(testList.what2(d));


    }
    public static IntList retList(int[] arr){
        IntList ret = new IntList();

        for(int i :arr)
            ret.add(i);

        return ret;
    }
}
