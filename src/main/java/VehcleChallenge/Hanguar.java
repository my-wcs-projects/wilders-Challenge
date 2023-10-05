package VehcleChallenge;

public class Hanguar {
    public static void main(String[] args) {
        Car car = new Car("Clio", 50000);
        Boat boat = new Boat("Titanic", 100000);

        System.out.println(car.doStuff());
        System.out.println((boat.doStuff()));
    }
}
