package day3;

import java.util.Scanner;

public class PrimeNo_way1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no ");
		int no=sc.nextInt(),count=0;
		for(int i=1;i<=no;i++) {
			if(no%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println(no+"  is primeno");
		}
		else {
			System.out.println(no+"  is not a primeno");
		}

	}

}
