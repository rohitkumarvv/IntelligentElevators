package elevator;

public class ElevatorFactory implements IElevatorFactory {

    public IElevator createElevator(ElevatorMediator mediator , int id){
        return new Elevator(mediator, id);
    }
}
