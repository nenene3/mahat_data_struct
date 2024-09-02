package aviv_2023_b.ex10;

public class Main {
    public static void main(String[] args) {
        SetOFNumbers setOFNumbers = new SetOFNumbers();
        setOFNumbers.addToSet(333331);
        setOFNumbers.addToSet(2);
        setOFNumbers.addToSet(3);
        setOFNumbers.addToSet(34);
        setOFNumbers.addToSet(345);
        setOFNumbers.addToSet(345234);
        setOFNumbers.addToSet(34523111);

        SetOFNumbers setOFNumbers1 = new SetOFNumbers();
        setOFNumbers1.addToSet(333331);
        setOFNumbers1.addToSet(2);
        setOFNumbers1.addToSet(3);
        setOFNumbers1.addToSet(34);
        setOFNumbers1.addToSet(345);
        setOFNumbers1.addToSet(345234);
        setOFNumbers1.addToSet(34523111);
        //delete all numbers isSame
//        System.out.println(setOFNumbers.isSame(setOFNumbers1));
//        System.out.println(setOFNumbers1);
        System.out.println(make(setOFNumbers1));
        System.out.println(setOFNumbers1);

    }

    public static SetOFNumbers make(SetOFNumbers sn) {
        if (sn == null)
            return null;
        SetOFNumbers ret = new SetOFNumbers();
        SetOFNumbers tmp = new SetOFNumbers();
        int max = 0;
        while (!sn.isEmpty()) {
            max = sn.getMax();
            if (10 <= max && max <= 100)
                ret.addToSet(max);
            sn.removeFromSet(max);
            tmp.addToSet(max);
        }
        while (!tmp.isEmpty()) {
            max = tmp.getMax();
            sn.addToSet(max);
            tmp.removeFromSet(max);
        }

        return ret;
    }


}
