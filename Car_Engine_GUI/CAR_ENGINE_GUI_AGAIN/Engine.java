package CAR_ENGINE_GUI_AGAIN;

import CAR_ENGINE_GUI_AGAIN.Exceptions.EngineException;

public class Engine {
    
    public void start() throws EngineException{

        System.out.println("Engine started");
        
        boolean hasError = true;

        if(hasError){
            throw new EngineException("engine Error");
        }
    }
}
