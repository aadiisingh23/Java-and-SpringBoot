package random;

public class Main {
    public static void main(String[] args) {
        PetrolEngine petrol = new PetrolEngine();
        DieselEngine diesel = new DieselEngine();
        Car car = new Car(diesel);
        car.drive();
       // petrol.start();
    }
}


/*

Dependancy Injection (DI) -> is a design pattern that allows object to recive  their dependancies from  a  external source rather then  creating internally.

Types of Dependany injection
1. Constructor Injection ->  Dependancy is provided via Constructor
1. Setter Injection ->  Dependancy is provided via setter method
1. Fields Injection ->  Dependancy is assigned directly to a fields



Web FrameWork ->  A web framework in Java is a collection of pre-written code, libraries, and components designed to simplify the development of web applications, services, and APIs



*/