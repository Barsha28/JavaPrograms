package practice;

public class RightShiftArray {

	public static void main(String[] args) {
		int a[]= {1,5,8,9,6},d=3;
		int temp[]=new int[a.length];
		for(int i=d;i<a.length-1;i++) {
			temp[i]=a[i];
			System.out.print(temp[i]);
			System.out.println(" ");
		}
		for(int j=0;j<d;j++) {
			temp[d+j]=a[j];
			System.out.print(temp[d+j]);
			System.out.println(" ");
		}
		
	}

}
