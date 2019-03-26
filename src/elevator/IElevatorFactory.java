package elevator;

public interface IElevatorFactory {

    IElevator createElevator(ElevatorMediator mediator , int id);
}
