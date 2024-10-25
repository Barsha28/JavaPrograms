package day3;

import java.util.Scanner;

public class Sum_Factor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no");
		int no=sc.nextInt(),sum=0;
		for(int i=1;i<=no;i++) {
			if(no%i==0) {
			sum+=i;
			}
		}
		System.out.println(sum);
	}

}
