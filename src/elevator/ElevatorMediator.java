package elevator;

public class ElevatorMediator {

    private ElevatorCollection elevatorCollection;

    public ElevatorMediator(ElevatorCollection elevatorCollection){
        this.elevatorCollection = elevatorCollection;
    }

    public void update(IElevatorInput input ) {
        for(IElevator elevator : elevatorCollection.getElevators()){
            elevator.notifyCall(input);
        }
    }
}
