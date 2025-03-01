package at.wil.cars.exceptions;

import java.util.Random;

public class Car {
    public Car(String color, Engine engine){
        this.engine = engine;
}

    public void startEngine () throws EngineException, CarException{
        
        Random r = new Random();
        if (r.nextBoolean()) {
                throw new CarException("Car has a problem.");
        }
        if (r.nextBoolean()) {
            throw new NullPointerException();
        }
        engine.start();
    }

    public Engine getEngine() {
        return engine;
    }
}
