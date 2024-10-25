package exception;

public class TwoCatchBlock {

	public static void main(String[] args) {
		System.out.println("main starts");
		int a[]= {5,6,8};
		try {
			System.out.println(a[1]/0);
		} 
		catch (ArithmeticException a1) {
			System.out.println("ariii");
			System.out.println(a1.getMessage());
		}
		
		catch (Exception e) {
			System.out.println("eee");
			System.out.println(e.getMessage());
		} 

	}

}
