package exception;

public class FinallyBlock {

	public static void main(String[] args) {
		System.out.println("main starts");
		try {
		System.out.println(10/0);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("database connection closed");
		}
		System.out.println("main ends");

	}

}
