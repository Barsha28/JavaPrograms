package exception;

public class UsingThrow {

	public static void main(String[] args) {
		System.out.println("main starts");
		try {
			throw new ArithmeticException("hello bro");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("system ends");
	}

}
