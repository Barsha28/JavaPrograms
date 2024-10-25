package constructor;

public class parameterized {
	int a;
	String b;
	public parameterized(int x,String y) {
		a=x;
		b=y;
		
	}
	public static void main(String[] args) {
		parameterized a1=new parameterized(10,"java");
		System.out.println(a1.a);
		System.out.println(a1.b);

	}

}
