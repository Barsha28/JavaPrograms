package day5;

import java.util.Scanner;

public class Swap_nos {

	public static void main(String[] args) {
		int temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two nos");
		int a=sc.nextInt(),b=sc.nextInt();
		temp=a;
		a=b;
		b=temp;
		System.out.println("after swap"+a);
		System.out.println("after swap"+b);
	}

}
