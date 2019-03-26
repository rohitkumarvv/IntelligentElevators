package elevator;

public class ElevatorControllerImpl implements IElevatorControler {


    private ElevatorMediator mediator;
    private ElevatorCollection elevators;

    public void ElevatorControllerImpl(){
        elevators = new ElevatorCollection();
        mediator = new ElevatorMediator(elevators);
    }

    public void addElevators(int num){

        for(int i = 0 ; i < num ; i++){
            IElevatorFactory elevatorFactory = FactoryManager.getFactoryManager().getElevatorFactory();
            IElevator elevator = elevatorFactory.createElevator(mediator , i);
            addElevatorToSystem(elevator);
        }
    }

    public void addElevatorToSystem(IElevator elevator){
        elevators.add(elevator);
    }

    public void removeElevatorFromSystem(IElevator elevator){
        elevators.remove(elevator);
    }

    @Override
    public void call(IElevatorInput input) {
        mediator.update(input);
    }
}
