package constructor;

public class Constructor_this {
	int a;
	String s;
	public 	Constructor_this(int a,String s){
		this.a=a;
		this.s=s;
	}
	public static void main(String[] args) {
		Constructor_this a1=new Constructor_this(10, "java");
		System.out.println(a1.a+" "+a1.s);
	}

}
