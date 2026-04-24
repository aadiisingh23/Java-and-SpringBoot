package springboot.lecture1.tightcoupling;

public class Main {
    public static void main(String[] args) {
        Car car  = new Car();
        car.drive();
        System.out.println("Car is Started : ");
    }
}
