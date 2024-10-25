package exception;

import java.io.IOException;

public class Handle_checkedExceptionusing_throws {
	public static void m1() throws IOException   {
			m2();
	}
	public static void m2() throws IOException  {
		
		throw new IOException("hello");
		
	}
	public static void main(String[] args){
		System.out.println("main starts");
		try {
		m1();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("main ends");
	}
}

