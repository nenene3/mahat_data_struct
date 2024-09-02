package summer_2023_a.ex6;

public class Hotel {
    private Room[] arr;

    public int totalTime(int[] numArr){
        int time=0;
        int baby=0;
        for (int j : numArr) {
            for (Room room : this.arr)
                if (room.getNum() == j) {
                    if (room instanceof FamilyRoom && ((FamilyRoom) room).isBabyBed())
                        baby++;
                    time += room.time();
                }

        }
        System.out.println("baby bed "+baby);
        return time;
    }

}
