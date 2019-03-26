package elevator;

public interface IElevatorInput {

    Floor getFloor();

    ElevatorDirection getDirection();

    boolean isAdd();
}
