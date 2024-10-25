package day6_array;

public class CopyArray {

	public static void main(String[] args) {
		int a[]= {23,25,2,5};
		int b[]= new int[a.length];
		b=a;
		for(int i=0;i<a.length;i++) {
			System.out.println(b[i]);
		}
//		for(int i=0;i<a.length;i++) {
//			b[i]=a[i];
//		}
//		for(int i=0;i<b.length;i++) {
//			System.out.println(b[i]);
//		}
		 
		
	}

}
