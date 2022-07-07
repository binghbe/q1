
/**
 * Priority Queueing
 *
 * @author bear
 * @version 13/05/2022
 */
public class PriorityQueue
{
    private Queue lowP;
    private Queue highP;

    public PriorityQueue(){
        lowP = new Queue();
        highP = new Queue();
    }

    

    public void enqueue(Element addFollower, boolean high){
        if (high){
            highP.enqueue(addFollower);
        }
        else 
            lowP.enqueue(addFollower);
    }

    Element dequeue(){
        if (highP.queueEmpty()){
            return lowP.dequeue();
        }
        else
            return highP.dequeue();
    }
    boolean queueEmpty(){
        if(highP.queueEmpty() && lowP.queueEmpty())
            return true;
        else
            return false;
    }
}