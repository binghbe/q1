/**
 * Queueing
 *
 * @author bera
 * @version 13/05/2022
 */
public class Queue
{
    private Element head;
    private Element tail;

    boolean queueEmpty(){
        if(head == null)
            return true;
        return false;
    }

    public void enqueue(Element addFollower){
        if (queueEmpty()){
            this.head = addFollower;
            this.tail = addFollower;
        }
        else{
            this.tail.setFollower(addFollower);
            this.tail = addFollower;
        }
    }

    Element dequeue(){
        if (queueEmpty())
            return null;
        Element frontElement = this.head;
        Element nextFront = frontElement.follower;
        this.head = nextFront;
        return frontElement;
    }

    public int numBehind(Element p){
        if (p.follower == null)
            return 0;
        return 1 + numBehind(p.follower);
    }

    public int queueLength(){
        if(queueEmpty()) 
            return 0;
        return 1 + numBehind(this.head);
    }
}