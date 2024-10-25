package constructor;

public class Constructor_overloading {
	int a;
	String b;
	public Constructor_overloading() {
		this.a=10;
		this.b="barsha";
	}
	public Constructor_overloading(int a,String b) {
		this.a=a;
		this.b=b;
	}
	
	public static void main(String[] args) {
		
		Constructor_overloading a1=new Constructor_overloading();
		Constructor_overloading a2=new Constructor_overloading(20, "java");
		System.out.println(a1.a+" "+a1.b);
		System.out.println(a2.a+" "+a2.b);

	}

}
