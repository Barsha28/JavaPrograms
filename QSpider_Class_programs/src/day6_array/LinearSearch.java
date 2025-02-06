package day6_array;

import java.util.Scanner;

public class LinearSearch {
public static void main(String[] args) {
	int a[]= {10,25,63,98};
	System.out.println("enter key");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	System.out.println(search(a, n));
}
static int search(int a[],int key) {
	for (int i = 0; i < a.length; i++) {
		if(a[i]==key)
			return i;
	}
	return -1;
	
}
}
