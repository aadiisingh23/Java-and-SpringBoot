package springboot.lecture1.loosecopling.random;

public class Car {
    private Engine engine;

    Car(Engine engine){
        this.engine =  engine;
        engine.start();
    }

    void drive(){
        System.out.println("Car ready to drive");
    }


}
