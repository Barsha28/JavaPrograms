package interface_programs;

public class multiple_demo implements Demo4{

	@Override
	public void m1() {
		System.out.println("m1");
	}

	@Override
	public void m2() {
		System.out.println("m2");	
	}

	@Override
	public void m3() {
		System.out.println("m3");
		
	}

	@Override
	public void m4() {
		System.out.println("m4");
		
	}

	@Override
	public void m5() {
		System.out.println("m5");
		
	}
	public static void main(String[] args) {
		multiple_demo m=new multiple_demo();
		m.m1();
	}

}
