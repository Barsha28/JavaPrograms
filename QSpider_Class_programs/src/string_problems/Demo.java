package string_problems;

class A{
	
	public static  void m1() {
		System.out.println("Hii");
	}
	
}

public class Demo extends A{
	
	public static void m1() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		A d1=new Demo();
		d1.m1();

	}

}
