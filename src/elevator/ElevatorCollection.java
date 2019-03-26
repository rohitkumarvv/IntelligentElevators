package elevator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ElevatorCollection {

    private List<IElevator> elevators;

    public ElevatorCollection(){
        elevators = new ArrayList<>();
    }

    public void add(IElevator elevator){
        elevators.add(elevator);
    }

    public void remove(IElevator elevator){
        elevators.remove(elevator);
    }

    public int size(){
        return elevators.size();
    }

    public Collection<IElevator> getElevators() {
        return elevators;
    }




}
