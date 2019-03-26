package elevator;

public class QueueNode implements Comparable<QueueNode> {
    private Floor floor;
    private ElevatorDirection direction;

    public QueueNode(Floor floor, ElevatorDirection direction) {
        this.floor = floor;
        this.direction = direction;
    }


    public Floor getFloor() {
        return floor;
    }

    public ElevatorDirection getDirection() {
        return direction;
    }

    @Override
    public boolean equals(Object obj) {

        QueueNode node = (QueueNode) obj;
        return (node.getFloor().getID() == this.floor.getID() &&
                node.getDirection().isMovingUp() == this.direction.isMovingUp());

    }

    @Override
    public int compareTo(QueueNode o) {
        if(o.getFloor().getID() < getFloor().getID()){
            return -1;
        }
        if(o.getFloor().getID() > getFloor().getID()){
            return 1;
        }
        return 0;
    }
}
