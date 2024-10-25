package exception;

public class TwoExceptionInOneTryBlock {

	public static void main(String[] args) {
		System.out.println("main starts");
		int a=10;
		int a1[]= {2,5};
		try {
			System.out.println(a/0);
		}
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println(a1[5]/0);
		} catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println(e1.getMessage());
		}
		System.out.println("main ends");

	}

}
