package summer_2022_a.ex10;

public class SpeedCameraNetwork {
    private SpeedCamera[] arr;

    public void addSpeedCamera(SpeedCamera speedCamera) {
        for (int i = 0; i < 100; i++)
            if (arr[i] == null) {
                arr[i] = speedCamera;
                break;
            }
    }

    public void printBackUp() {
        for (SpeedCamera speedCamera : this.arr)
            if (speedCamera.isNeedBackUp())
                System.out.println(speedCamera.getRoad());
    }
    public boolean hasCommitedSpeeding(int car){
        int count=0;
        for(SpeedCamera speedCamera : this.arr)
            if(speedCamera.isCommitedSpeeding(car)){
                System.out.println(speedCamera.getCode());
                count++;
            }

        return count!=0;
    }
}
