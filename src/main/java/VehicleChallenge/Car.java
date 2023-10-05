package VehicleChallenge;

public class Car extends Vehicle {

    public Car(String brand, int kilometers) {
        super(brand, kilometers);
    }

    public String doStuff() {
        return "Je suis " + getBrand() + " et je fais vroum vroum !";
    }
}
