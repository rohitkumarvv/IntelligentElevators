package elevator;

public interface IElevator {

    void notifyCall(IElevatorInput input);

    void addMediator(ElevatorMediator elevatorMediator);

}
