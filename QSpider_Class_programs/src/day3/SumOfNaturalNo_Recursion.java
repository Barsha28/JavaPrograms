package day3;

public class SumOfNaturalNo_Recursion {

	public static int recurSum(int n) {
		if(n==1) {
			return n;
		}
		return n+recurSum(n-1);
	}
	public static void main(String[] args) {
	int n=10;
		int sum=recurSum(n);
		System.out.println("sum of n natural no is "+sum);
	}
}
//int no=10,sum=0;
//for(int i=1;i<=no;i++) {
//	sum=sum+i;
//}
//System.out.println("sum of n natural no  "+sum);

