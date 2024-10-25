package static_member;

public class Static_block {
	int a;
	static int b;
	static 
	{
		b=20;
		System.out.println(b+" i am static variable");
		System.out.println("i am static block");
	}
	{
		a=10;
		System.out.println("i am non static block");
	}
	public static void main(String[] args) {
		Static_block a1=new Static_block();
		System.out.println(a1.a);
		System.out.println(b);
	}

}
