package uncheckedCustomException;

public class NotEligibleToVote extends RuntimeException{
	public String getMessage() {
		return "Not Eligible";
	}
}
