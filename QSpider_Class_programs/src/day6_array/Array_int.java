package day6_array;

import java.util.Scanner;

public class Array_int {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no");
		int size=sc.nextInt();
		int []a=new int[size];
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("after entering values");
		for(int i=1;i<size;i++) {
			System.out.println(a[i]);
		}
	}

}
