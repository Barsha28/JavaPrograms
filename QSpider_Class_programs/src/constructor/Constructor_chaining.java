package constructor;

public class Constructor_chaining {
	public Constructor_chaining() {
		this(10);
		System.out.println("constructor1");
	}
	public Constructor_chaining(int a) {
		this(10,2.2);
		System.out.println("constructor2");
		
	}
	public Constructor_chaining(int a,double d) {
		System.out.println("constructor3");
	}
	public static void main(String[] args) {
		Constructor_chaining a1=new Constructor_chaining();

	}

}
