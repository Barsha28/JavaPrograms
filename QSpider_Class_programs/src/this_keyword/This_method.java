package this_keyword;

public class This_method {
	int a=10;
	public void m1() {
		System.out.println(this.a);
	}
	public static void main(String[] args) {
		This_method a1=new This_method();
		a1.m1();
	}

}
