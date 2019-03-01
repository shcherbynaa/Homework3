package carcar;

public class CarWheel {

    private double tireIntegrity;

    public CarWheel() {
        this.tireIntegrity = 1;
    }

    public CarWheel(double tireIntegrity) {
        this.tireIntegrity = tireIntegrity;
    }

    public static void changeBus(){
        this.tireIntegrity = 1;
    }

    public static void wipeTire(double percentOfWipe){
        this.tireIntegrity = this.tireIntegrity - 0.01*percentOfWipe;
    }

    public double getTireIntegrity() {
        return tireIntegrity;
    }

    public void printInfoCarWheel(){
        System.out.println("Wheel condition - " + getTireIntegrity());
    }
}
