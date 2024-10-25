package typeCasting;

public class Child extends UpCasting_Parent{
	int b=20;
	public void m2() {
		System.out.println("sub class methods");
	}
	public void property() {
		System.out.println("house+car");
	}
	public static void main(String[] args) {
		UpCasting_Parent c1=new Child();
		System.out.println(c1.a);
		//System.out.println(c1.b);
		c1.m1();
		//c1.m2();
		c1.property();

	}

}
