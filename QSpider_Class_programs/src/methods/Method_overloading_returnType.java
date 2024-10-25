package methods;

public class Method_overloading_returnType {
	public static int add(int a,int b) {
		return a+b;
	}
	public void add() {
		int a=10,b=20;
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		Method_overloading_returnType m1=new Method_overloading_returnType();
		m1.add();
		int b=add(30,50);
		System.out.println(b);
	}

}
