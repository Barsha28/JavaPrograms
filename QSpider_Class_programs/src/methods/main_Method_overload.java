package methods;

public class main_Method_overload {
	public static void main() {
		System.out.println("hi");
	}
	public static void main(int a) {
		System.out.println("bye");
	}
	public static void main(String[] args) {
		System.out.println("gd mrng");
		main();
		main(10);
	}

}
