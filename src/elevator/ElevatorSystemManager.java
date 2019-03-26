package elevator;

public class ElevatorSystemManager {

    private ElevatorSystemManager manager = null;
    private IElevatorControler controller;

    private ElevatorSystemManager(){
        IControllerFactory controllerFactory = FactoryManager.getFactoryManager().getControllerFactory();
        controller = controllerFactory.createController();
    }

    public ElevatorSystemManager getManager(){
        if(manager == null){
            return new ElevatorSystemManager();
        }
        return manager;
    }

    public void addElevatorsToSystem(int num){
        controller.addElevators(num);
    }

    public void callElevator(IElevatorInput input){
        controller.call(input);
    }


}
