package CAR_ENGINE_GUI_AGAIN;

import CAR_ENGINE_GUI_AGAIN.Exceptions.CarException;
import CAR_ENGINE_GUI_AGAIN.Exceptions.EngineException;

public class Gui {
    public static void main(String[] args) {
        Engine e1 = new Engine();
        Car c1 = new Car(e1, "blue");

        try {
            c1.startEngine();
        } catch (NullPointerException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();   
        } 
        catch (EngineException e) {
            e.printStackTrace();
        }
        catch (CarException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}