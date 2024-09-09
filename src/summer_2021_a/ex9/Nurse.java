package summer_2021_a.ex9;

public class Nurse extends Employee{
    private String type;

    public Nurse(String name,String type){
        super(name);
        this.type=type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
