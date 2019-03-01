package carcar;

public class CarDoor {

    private boolean isDoorOpen;
    private boolean isWindowOpen;

    public CarDoor() {
        this.isDoorOpen = false;
        this.isWindowOpen = false;
    }

    public CarDoor(boolean isDoorOpen, boolean isWindowOpen) {
        this.isDoorOpen = isDoorOpen;
        this.isWindowOpen = isWindowOpen;
    }

    public boolean isDoorOpen() {
        return isDoorOpen;
    }

    public boolean isWindowOpen() {
        return isWindowOpen;
    }

    public static void openDoor(boolean isDoorOpen){
        this.isDoorOpen = true;
    }

    public static void closeDoor(boolean isDoorOpen){
        this.isDoorOpen = false;
    }

    public static void openOrCloseDoor(boolean isDoorOpen){
        if (isDoorOpen){
            isDoorOpen = false;
        }
        else{
            isDoorOpen = true;
        }
    }

    public static void openWindow(boolean isWindowOpen{
        this.isWindowOpen = true;
    }


    public static void closeWindow(boolean isWindowOpen{
        this.isWindowOpen = false;
    }

    public static void openOrCloseWindow(boolean isWindowOpen){
        if (isWindowOpen){
            isWindowOpen = false;
        }
        else{
            isWindowOpen = true;
        }
    }


    public static void main(String[] args){
        System.out.println("hello");
        CarDoor carDoor = new CarDoor();
        openDoor(true);

    }
}
