package exception;

public class ExceptionPropagation {
	public static void m1() {
		m2();
	}
	public static void m2() {
		try {
			System.out.println(10/0);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) {
		m1();
	}

}
