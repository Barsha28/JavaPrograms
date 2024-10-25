package this_keyword;

public class This_variable {
	int a=10;
	public void m1() {
		System.out.println("i am m1 method");
		this.m2();
		System.out.println(this.a);
	}
	public void m2() {
		System.out.println("i am m2 method");
	}
	public static void main(String[] args) {
		This_variable a1=new This_variable();
		a1.m1();
	}

}
