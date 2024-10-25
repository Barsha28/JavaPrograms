package exception;

public class AirthmaticException {

	public static void main(String[] args) {
		System.out.println("hi");
		int a=10;
		try {
		System.out.println(a/0);
		}
		catch(ArithmeticException a1) {
			System.out.println(a1.getMessage());
		}
		System.out.println("hello");
	}

}
