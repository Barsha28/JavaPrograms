package day6_array;

public class MergeTwoArray {

	public static void main(String[] args) {
		int a[]= {1,2,3};
		int b[]= {9,5,6,8};
		int c[]=new int[a.length+b.length];
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		for(int j=0;j<b.length;j++) {
			c[j+a.length]=b[j];
		}
		for(int k=0;k<c.length;k++) {
			System.out.print(c[k]+" ");
		}
		

	}

}
