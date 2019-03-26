package elevator;

public class ElevatorInput implements IElevatorInput {

    private Floor floor;
    private ElevatorDirection direction;
    private boolean isAdd;

   public ElevatorInput(Floor floor , ElevatorDirection direction , boolean isAdd){
       this.floor = floor;
       this.direction = direction;
       this.isAdd = isAdd;
   }

    @Override
    public Floor getFloor() {
        return floor;
    }

    @Override
    public ElevatorDirection getDirection() {
        return direction;
    }

    @Override
    public boolean isAdd() {
        return isAdd;
    }
}
