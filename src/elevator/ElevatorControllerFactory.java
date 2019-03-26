package elevator;

public class ElevatorControllerFactory implements IControllerFactory {

    @Override
    public IElevatorControler createController() {
        return new ElevatorControllerImpl();
    }
}
