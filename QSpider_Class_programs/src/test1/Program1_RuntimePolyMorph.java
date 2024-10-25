package test1;

public class Program1_RuntimePolyMorph {
	public void m1() {
		System.out.println("m1 method");
	}
	public static void main(String[] args) {
		Child c=new Child();
		c.m1();
	}
	
}
class Child extends Program1_RuntimePolyMorph{
	public void m1() {
		System.out.println("m1+m2");
	}

}

