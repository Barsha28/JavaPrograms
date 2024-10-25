package test1;

public class Program10 {
	int a=10;
	public Program10() {
		System.out.println("parent class constructor");
	}
	public Program10(String b) {
		this();
	}
	public void m1() {
		System.out.println(this.a);
	}
	
}
