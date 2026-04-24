package springboot.lecture1.loosecopling.random;

public class Main {
    public static void main(String[] args) {
        PetrolEngine petrol = new PetrolEngine();
        DieselEngine diesel = new DieselEngine();
        Car car = new Car(diesel);
        car.drive();
       // petrol.start();
    }
}






*/