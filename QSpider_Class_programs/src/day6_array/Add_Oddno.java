package day6_array;

public class Add_Oddno {

	public static void main(String[] args) {
		int a[]= {2,3,4,8,9,5},sum=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==1) {
				sum=sum+a[i];
			}
		}
		System.out.println(sum+"  sum of odd no");
	}

}
