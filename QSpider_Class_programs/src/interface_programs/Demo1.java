package interface_programs;

public class Demo1 implements Demo_Interface{
	public void m1() {
		System.out.println("m1 method");
	}
	public void m2() {
		System.out.println("m2 method");
	}
	
	public static void main(String[] args) {
		Demo_Interface d=new Demo1();
		d.m1();
		d.m2();
	}
}
