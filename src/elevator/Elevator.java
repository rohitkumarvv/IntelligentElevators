package elevator;

public class Elevator implements IElevator {

    private int id;
    private Floor floor;
    private State state;
    private ElevatorMediator mediator;
    private StopQueueComparator comparator;
    private StopQueue queue;

    public Elevator(ElevatorMediator mediator , int id) {
        this.id = id;
        state = new State();
        addMediator(mediator);
        comparator = new StopQueueComparator();
        queue = new StopQueue();
        floor = new Floor(0);
    }

    @Override
    public void notifyCall(IElevatorInput input) {

        updateStopQueue(input);
    }

    @Override
    public void addMediator(ElevatorMediator elevatorMediator) {
        this.mediator = elevatorMediator;
    }

    private void updateStopQueue(IElevatorInput input) {
        Floor floor = input.getFloor();
        ElevatorDirection direction = input.getDirection();
        boolean add = input.isAdd();
        if(add){
            queue.add(new QueueNode(floor , direction));
        }else{
            queue.remove(new QueueNode(floor , direction));
        }
        comparator.sort(queue , this.state.getDirection());
    }

    public void openElevator(){
        IElevatorInput input = new ElevatorInput(this.floor , this.state.getDirection() , false);
        mediator.update(input);
    }
}
