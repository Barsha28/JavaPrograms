package exception;

public class StringIndexOutOfBoundException {

	public static void main(String[] args) {
		String s="java";
		try {
		System.out.println(s.charAt(6));
		}
		catch(StringIndexOutOfBoundsException a1) {
			System.out.println(a1.getMessage());
		}
	}

}
