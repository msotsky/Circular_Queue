import java.util.*;

public class UnboundedInteger implements QueueADT{
    private int currentSize; 			
    private int maxSize; 				
    private Integer[] circularQueue;
    private int front; 					    
    private int rear;					

    public UnboundedInteger(int maxSize) {
        this.maxSize = maxSize;
        circularQueue =  new Integer[this.maxSize];
        currentSize = 0;
        front = 0;
        rear = 0;
    }
    //===================================================
    public void enqueue(int item) {
    	
        if (isFull()) {
        	expandCapacity(); // if the queue is full, double the capacity
        }
        else {
            circularQueue[rear] = item;
            rear = (rear + 1) % circularQueue.length;
            currentSize++;
        }
    }
    public int dequeue() throws EmptyCollectionException { //front
        int deQueuedElement;
        if (isEmpty()) {
        	throw new EmptyCollectionException ("queue");
        }
        else {
            deQueuedElement = circularQueue[front];
            circularQueue[front] = null; 	// Note that instead of just ignoring the contents of a deleted element, here the object reference is set to null
            front = (front + 1) % circularQueue.length;
            currentSize--;
        }
        return deQueuedElement;
    }
    public int peek() throws EmptyCollectionException {
    	if (isEmpty()) {
    		throw new EmptyCollectionException ("queue");
    	}
    	return circularQueue[front];
    }
    public boolean isFull() {
        return (currentSize == circularQueue.length);
    }
    public boolean isEmpty() {
        return (currentSize == 0);
    }
    public int getSize() {
    	return currentSize;
    }
        /**
     *  Creates a new array to store the contents of the queue with
     *  twice the capacity of the old one.
     */
    private void expandCapacity(){
    	Integer[] larger = (new Integer[circularQueue.length *2]);   

    	for(int scan=0; scan < currentSize; scan++){
    		larger[scan] = circularQueue[front];
    		front=(front+1) % circularQueue.length;
    	}

    	front = 0;
    	rear = currentSize;
    	circularQueue = larger;
    }
    @Override
    public String toString() {
        return "Contents of the circular queue " + Arrays.toString(circularQueue);
    }

    public void assignValue(String num)
	{
        int i = num.length();

		if (num.charAt(0)== '-'){
            this.enqueue(-1);
            i--;
            for(; i > 0; i--)
                this.enqueue(Character.getNumericValue(num.charAt(i)));	
        }
        else{
            this.enqueue(1);
            i--;
            for(; i > -1; i--)
                this.enqueue(Character.getNumericValue(num.charAt(i)));	
        }	

            		
	}	
}