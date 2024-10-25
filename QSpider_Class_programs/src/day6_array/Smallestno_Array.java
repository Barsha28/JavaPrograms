package day6_array;

public class Smallestno_Array {

	public static void main(String[] args) {
		int a[]= {12,35,3,89,90,3,35};
		int smallest=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<smallest) {
				smallest=a[i];
			}
		}
		System.out.println(smallest);
		
	}

}
