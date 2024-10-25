package interface_programs;

public class Implementing_interface implements Demo_Interface,Demo2{
	public void m1() {
		System.out.println("m1 method");
	}
	public void m2() {
		System.out.println("m2 method");
	}
	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void m4() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		Implementing_interface i=new Implementing_interface();
		i.m1();
		i.m2();
		i.m3();i.m4();
	}
	
}
