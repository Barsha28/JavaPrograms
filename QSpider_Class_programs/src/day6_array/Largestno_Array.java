package day6_array;

public class Largestno_Array {

	public static void main(String[] args) {
		int a[]= {12,35,89,90};
		int largest=a[0];
		for(int i=0;i<a.length;i++) {
			if(largest>a[i]) {
				largest=a[i];
			}
		}
		System.out.println(largest);

	}

}
