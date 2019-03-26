package elevator;

import java.util.PriorityQueue;

public class StopQueue extends PriorityQueue {

    PriorityQueue<QueueNode> queue ;

    public StopQueue(){
        queue = new PriorityQueue<>();
    }

    public void add(QueueNode node){
        queue.offer(node);
    }

    public void remove(QueueNode node){
        queue.remove(node);
    }

}
