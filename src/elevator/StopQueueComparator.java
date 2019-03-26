package elevator;

import java.util.LinkedList;
import java.util.Queue;

public class StopQueueComparator<T extends StopQueue> {

  public void sort(T queue , ElevatorDirection direction){

      Queue<QueueNode> temp_Queue = new LinkedList<>();
      Queue<QueueNode> append_Queue = new LinkedList<>();

      while(!queue.isEmpty()){
          QueueNode node = (QueueNode) queue.poll();
          if(direction.isMovingUp() == node.getDirection().isMovingUp()){
              temp_Queue.add(node);
          }else{
              append_Queue.add(node);
          }
      }
      while(!temp_Queue.isEmpty()){
          queue.add(temp_Queue.poll());
      }
      while(!append_Queue.isEmpty()){
          queue.add(append_Queue.poll());
      }
  }
}
