package exception;

public class Flow {

	public static void main(String[] args) {
		System.out.println("main starts");
		int a=10;
		try {
			System.out.println("try starts");
			System.out.println(a/0);
			System.out.println("try ends");
		} catch (ArithmeticException a1) {
			System.out.println("catch starts");
			System.out.println(a1.getMessage());
			System.out.println("catch ends");
		}
		System.out.println("main ends");

	}

}
