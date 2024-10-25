package day5;

public class Swap_without_temp {

	public static void main(String[] args) {
	int a=5;
	int b=10;
	a=a+b;
	b=a-b;
	a=a-b;
	
	System.out.println(b);
	System.out.println(a);
	}

}
