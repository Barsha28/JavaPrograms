package day6_array;

public class Sum_Array {

	public static void main(String[] args) {
		int a[]= {1,2,3,4},sum=0;
		int len=a.length;
		for(int i=0;i<len;i++) {
			sum=sum+a[i];
		}
		System.out.println("sum of array  "+sum);
	}

}
