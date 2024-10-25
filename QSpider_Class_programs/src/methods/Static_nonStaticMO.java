package methods;

public class Static_nonStaticMO {
	public static void add() {
		int a=10,b=20;
		System.out.println(a+b);
	}
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		Static_nonStaticMO m1=new Static_nonStaticMO();
		m1.add(20, 30);
		add();
	}

}
