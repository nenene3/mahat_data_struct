package summer_2021_a.ex9;

public class Doctor extends Employee{
    private String specialization;

    public Doctor(String name,String specialization){
        super(name);
        this.specialization=specialization;
    }
}
