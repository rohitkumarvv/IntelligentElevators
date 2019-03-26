package elevator;

public class State {

    private ElevatorDirection direction;

    private boolean isIdle;

    public State(){
        isIdle = true;
    }

    public ElevatorDirection getDirection() {
        return direction;
    }

    public boolean isIdle() {
        return isIdle;
    }

    public void setIdle(boolean idle) {
        isIdle = idle;
    }

    public void setDirection(ElevatorDirection direction) {
        this.direction = direction;
    }
}
