
/**
 * QueueADT : defines the interface for a queue
 */

public interface QueueADT {
	
   /**
    *   Adds one element to the rear of the queue
    */
   public void enqueue (int element);

   /**
    *  Removes and returns the element at the front of the queue
    */
   public int dequeue() throws EmptyCollectionException;

   /**
    *   Returns without removing the element at the front of the queue
    */
   public int peek() throws EmptyCollectionException;
   
   /**
    *   Returns true if the queue contains no elements
    */
   public boolean isEmpty();

   /**
    *   Returns the number of elements in the queue
    */
   public int getSize();

   /**
    *   Returns a string representation of the queue
    */
   public String toString();
}


