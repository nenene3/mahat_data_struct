package aviv_2023_b.ex6;

public class TeachingStaff {
    private Employee[] arr;
    private int current;


    public TeachingStaff() {
        this.arr = new Employee[200];
        this.current = 0;
    }

    public int numHeads() {
        int h = 0;
        for (int i = 0; i < current; i++)
            if (this.arr[i] instanceof Head)
                h++;

        return h;
    }

    public Tutor getNewTutor(int course) {
        Tutor t = null;
        for (int i = 0; i < current; i++)
            if (this.arr[i] instanceof Tutor && ((Tutor) this.arr[i]).getCourseNum() == course)
                if (t == null) {
                    t = (Tutor) this.arr[i];
                } else {
                    if (t.getNum() < this.arr[i].getNum())
                        t = (Tutor) this.arr[i];
                }

        return t;
    }
}
