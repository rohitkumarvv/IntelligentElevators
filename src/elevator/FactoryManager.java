package elevator;

public class FactoryManager {

    private static FactoryManager factoryManager = null;
    private IControllerFactory controllerFactory;
    private IElevatorFactory elevatorFactory;


    private FactoryManager(){
        controllerFactory = new ElevatorControllerFactory();
        elevatorFactory = new ElevatorFactory();
    }

    public static FactoryManager getFactoryManager() {
        if(factoryManager == null){
            return new FactoryManager();
        }
        return factoryManager;
    }

    public IControllerFactory getControllerFactory() {
        return controllerFactory;
    }

    public IElevatorFactory getElevatorFactory() {
        return elevatorFactory;
    }
}
