package practice;

import java.util.Scanner;

public class SearchElement_Array {
public static void main(String[] args) {
	int a[]= {1,2,3};
	Scanner sc=new Scanner(System.in);
	System.out.println("enter element");
	int no=sc.nextInt();
	for (int i = 0; i < a.length; i++) {
		if(no==a[i]) {
			System.out.println("no is present"+no);
			break;
		}
		else {
			System.out.println("not present"+no);
		}
	}
	
}
}
