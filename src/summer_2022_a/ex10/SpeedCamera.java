package summer_2022_a.ex10;

import data_Structs.Node;
import data_Structs.Stack;

public class SpeedCamera {
    private String code;
    private int road;
    private int maxSpeed;
    private Stack<Integer> collCars;

    public SpeedCamera(String code,int road,int maxSpeed){
        this.code=code;
        this.road=road;
        this.maxSpeed=maxSpeed;
        this.collCars= new Stack<>();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getRoad() {
        return road;
    }

    public void setRoad(int road) {
        this.road = road;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Stack<Integer> getCollCars() {
        return collCars;
    }

    public void setCollCars(Stack<Integer> collCars) {
        this.collCars = collCars;
    }
    public void addCar(int car,int speed){
        if(this.maxSpeed < speed)
            this.collCars.push(car);
    }

    public boolean isNeedBackUp(){
        int counter=0;
        Stack<Integer> tmp = new Stack<>();
        while(!this.collCars.isEmpty()){
            tmp.push(this.collCars.pop());
            counter++;
        }
        while(!tmp.isEmpty())
            this.collCars.push(tmp.pop());

        return 200 < counter;
    }
    public boolean isCommitedSpeeding(int car){
        Stack<Integer> tmp = new Stack<>();
        boolean flag = false;

        while(!this.collCars.isEmpty()){
            if(car==this.collCars.top()){
                flag=true;
                break;
            }
            tmp.push(this.collCars.pop());
        }

        while(!tmp.isEmpty())
            this.collCars.push(tmp.pop());

        return flag;
    }
}
