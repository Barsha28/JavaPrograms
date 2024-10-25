package constructor;

public class Method_this {
	int a;
	String b;
	public void setValue(int a,String b) {
		this.a=a;
		this.b=b;
		
	}
	public static void main(String[] args) {
		Method_this a1=new Method_this();
		a1.setValue(10, "java");
		System.out.println(a1.a+" "+a1.b);

	}

}
