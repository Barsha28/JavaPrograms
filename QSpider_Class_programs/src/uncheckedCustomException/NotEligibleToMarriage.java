package uncheckedCustomException;

public class NotEligibleToMarriage extends Exception{
	public String getMessage() {
		return "Not eligible";
	}
}
