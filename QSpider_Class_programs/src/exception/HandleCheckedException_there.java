package exception;

import java.io.IOException;

public class HandleCheckedException_there {
	public static void m1() {
		m2();
	}
	public static void m2() {
		try {
		throw new IOException("hello");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) {
		System.out.println("main starts");
		m1();
		System.out.println("main ends");
	}
}
