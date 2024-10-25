package polymorphism;
class Abc{
	public void m1() {
		System.out.println("m1 method");
	}
}
class cde extends Abc{
	public void m2() {
		System.out.println("m2 method");
	}
}
public class Runtime_polymorphism {

	public static void main(String[] args) {
	cde  a1=new cde();
	a1.m1();
	a1.m2();

	}

}
