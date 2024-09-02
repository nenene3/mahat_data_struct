package summer_2023_a.ex6;

public class Hotel {
    private Room[] arr;

    public int totalTime(int[] numArr){
        int time=0;
        int baby=0;
        for(int i=0;i< numArr.length;i++){
            for(int j=0;j<this.arr.length;j++){
                if(this.arr[j].getNum()==numArr[i]){
                    if(this.arr[j] instanceof FamilyRoom && ((FamilyRoom) this.arr[j]).isBabyBed())
                        baby++;
                    time+=this.arr[j].time();
                }
            }
        }
        System.out.println("baby bed "+baby);
        return time;
    }

}
