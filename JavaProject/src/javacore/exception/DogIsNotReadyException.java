package javacore.exception;

public class DogIsNotReadyException extends Exception {

	   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DogIsNotReadyException(String message) {
	       super(message);
	   }
	}