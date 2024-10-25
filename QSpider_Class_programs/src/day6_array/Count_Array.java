package day6_array;

public class Count_Array {

	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==1) {
				count++;
			}
		}
		System.out.println(count);
	}

}
