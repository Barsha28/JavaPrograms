package exception;

public class ArrayIndexOutOfBoundExcep {
	public static void main(String[] args) {
		int a[]= {10,20,30};
		System.out.println("hi");
		try {
		System.out.println(a[5]);
		}
		catch(ArrayIndexOutOfBoundsException a1) {
			System.out.println(a1.getMessage());
		}
		
		System.out.println("hello");
	}
}
