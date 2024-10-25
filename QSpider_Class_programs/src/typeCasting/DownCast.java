package typeCasting;

public class DownCast extends UpCasting_Parent{
	int b=20;
	public void m2() {
		System.out.println("sub class methods");
	}
	public void property() {
		System.out.println("house+car");
	}
	public static void main(String[] args) {
		UpCasting_Parent c1=new DownCast();
		DownCast d=(DownCast) c1;
		System.out.println(d.a);
		System.out.println(d.b);
		d.m1();
		d.m2();
		d.property();
		
	}

}
