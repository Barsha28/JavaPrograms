package practice;

public class CopyArrayToAnotherArrayRev {

	public static void main(String[] args) {
		int a[]= {1,2,3};
		int b[]=new int[a.length];
		for (int i = a.length-1; i >=0; i--) {
			b[i]=a[i];
			System.out.println(b[i]);
		}

	}

}
