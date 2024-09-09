package summer_2021_a.ex9;

import data_Structs.Node;

public class AllEmployees {
    private int current;
    private Employee[] arr;

    public AllEmployees() {
        this.arr = new Employee[200];
        this.current = 0;
    }

    public int numSupervisor() {
        int counter = 0;

        for (Employee emp : this.arr)
            if (emp instanceof Supervisor)
                counter++;

        return counter;
    }

    public Nurse getNewNurse(String type) {
        Nurse ret = null;
        for (Employee employee : this.arr) {
            if (employee instanceof Nurse && ((Nurse) employee).getType().equals(type)) {
                if (ret == null)
                    ret = (Nurse) employee;

                if (employee.getNum() > ret.getNum())
                    ret = (Nurse) employee;
            }
        }

        return ret;
    }
}
