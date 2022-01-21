
public class EmptyCollectionException extends Exception {
	public EmptyCollectionException (String collection){
		super ("The " + collection + " is empty.");
	}
}
