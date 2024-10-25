package day6_array;

public class SwapFirstHalfToSecondHalf {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6};
	int b[]=new int[a.length];
	int c[]=new int[a.length];
	for (int i = 0; i < a.length/2; i++) {
		b[i]=a[i];
		//System.out.println(b[i]);
	}
	for (int j = a.length/2; j < a.length; j++) {
		c[b.length-1+j]=a[j];
		System.out.println(c[b.length+j]);
	}
}
}
