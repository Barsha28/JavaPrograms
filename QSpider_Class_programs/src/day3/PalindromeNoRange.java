package day3;

import java.util.Scanner;

public class PalindromeNoRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter start no");
		int start=sc.nextInt();
		System.out.println("enter end no");
		int end=sc.nextInt();
		for (int i = start; i <= end; i++) {
			
			int no=i,rev=0;
			int temp=no;
			while(no>0) {
				int rem=no%10;
				rev=rev*10+rem;
				no=no/10;
			}
			if(temp==rev) {
				System.out.println(rev+"palindrome");
			}
			
		}

	}

}
