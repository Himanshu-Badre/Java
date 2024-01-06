package Exception_Handling;

public class InvalidFormatException extends RuntimeException{
	public InvalidFormatException(String errMsg) {
		super(errMsg);
	}
}
