package springboot.lecture1.tightcoupling;

public class Car {
    private Engine engine;

    Car(){
        this.engine = new Engine();
        
    }

    void drive(){
        engine.start();
    }
}
