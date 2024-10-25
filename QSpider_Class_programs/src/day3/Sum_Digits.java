package day3;

import java.util.Scanner;

public class Sum_Digits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no");
		int no=sc.nextInt(),sum=0;
		while(no>0) {
			int rem=no%10;//3,2,1
			sum=sum+rem;//3,5,6
			no=no/10;//12,1,0
		}
		System.out.println(sum+"  sum of the digits");
	}

}
