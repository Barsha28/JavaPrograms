package day6_array;

import java.util.Scanner;

public class Array_char {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no");
		int size=sc.nextInt();
		char []ch=new char[size];
		System.out.println("enter variable");
		for(int i=0;i<size;i++) {
			ch[i]=sc.next().charAt(i);
		}
		
		System.out.println("printing values");
		for(int i=0;i<size;i++) {
			System.out.println(ch[i]);
		}

	}

}
