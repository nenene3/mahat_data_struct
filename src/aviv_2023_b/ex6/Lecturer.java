package aviv_2023_b.ex6;

public class Lecturer extends Employee{
    private String specialization;

    public Lecturer(String name, String specialization) {
        super(name);
        this.specialization = specialization;
    }
}
