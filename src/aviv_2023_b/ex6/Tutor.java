package aviv_2023_b.ex6;

public class Tutor extends Employee{

    private int courseNum;

    public Tutor(String name, int courseNum) {
        super(name);
        this.courseNum = courseNum;
    }

    public int getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(int courseNum) {
        this.courseNum = courseNum;
    }
}
