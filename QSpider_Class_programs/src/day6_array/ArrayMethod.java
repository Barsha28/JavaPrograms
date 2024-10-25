package day6_array;

public class ArrayMethod {
	public static void m1(int[]a) {
		System.out.println("the array element are");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		int a[]= {10,20,30};
		m1(a);

	}

}
