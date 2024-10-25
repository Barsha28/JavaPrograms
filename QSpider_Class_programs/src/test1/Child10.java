package test1;

public class Child10 extends Program10{
	
	public Child10() {
		super("abc");
	}
	public void m3() {
		System.out.println(super.a);
	}
	public static void main(String[] args) {
		Child10 c= new Child10();
		c.m1();
		
		c.m3();

	}

}
