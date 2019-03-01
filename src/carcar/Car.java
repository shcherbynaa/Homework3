package carcar;

import java.util.Date;

public class Car {

    private final Date manufacturedAt;
    private String typeOfMoto;
    private int maxSpeed;
    private double timeto100km;
    private int capacityPassenger;
    private int numberOfPassenger;
    private int currentSpeed;
    private CarWheel[] carWheels;
    private CarDoor[] carDoors;

    public Car(Date manufacturedAt) {
        this.manufacturedAt = manufacturedAt;
    }

    public Car(Date manufacturedAt, String typeOfMoto, int maxSpeed, double timeto100km, int capacityPassenger,
               int numberOfPassenger, int currentSpeed) {
        this.manufacturedAt = manufacturedAt;
        this.typeOfMoto = typeOfMoto;
        this.maxSpeed = maxSpeed;
        this.timeto100km = timeto100km;
        this.capacityPassenger = capacityPassenger;
        this.numberOfPassenger = numberOfPassenger;
        this.currentSpeed = currentSpeed;
    }

    public static void changeCurrentSpeed(int currentSpeed){
        this.currentSpeed = currentSpeed;
    }

    public static void addOnePassenger(){
        if (this.numberOfPassenger!=this.capacityPassenger){
            this.numberOfPassenger++;
        }
        else
        {
            return;
        }
    }

    public static void dropoutOnePassenger(){
        if (this.numberOfPassenger>0){
            this.numberOfPassenger--;
        }
        else{
            return;
        }
    }

    public static void dropOutAllPassengers(){
        if (this.numberOfPassenger>0){
            this.numberOfPassenger == 0;
        }
        else{
            return;
        }
    }




}
