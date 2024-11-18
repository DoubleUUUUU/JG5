package CAR_ENGINE_GUI_AGAIN;

import CAR_ENGINE_GUI_AGAIN.Exceptions.CarException;
import CAR_ENGINE_GUI_AGAIN.Exceptions.EngineException;

import java.util.Random;

public class Car {
    
    private Engine engine;
    private String color;

    public Car (Engine engine, String color)
    {
        this.engine = engine;
        this.color = "red";
    }

    public void startEngine() throws CarException, EngineException, NullPointerException {
        Random r = new Random();
        if(r.nextBoolean()) {
            throw new CarException("Car has a problem");
        }
        if (r.nextBoolean()) {
            throw new EngineException("Engine has a problem");
        }
        if (r.nextBoolean()) {
            throw new NullPointerException();
        }
        

        try {
            engine.start();
        }
        catch (EngineException e) {
            e.printStackTrace();
        }
    }

    public Engine getEngine() {
        return engine;
    }
}
