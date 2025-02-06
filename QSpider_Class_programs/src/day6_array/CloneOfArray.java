package day6_array;

import java.util.Arrays;

public class CloneOfArray {
public static void main(String[] args) {
	int a[]= {10,2,3};
	for(int c:a) {
		System.out.print(c);
	}
	int b[]=a.clone();
	for(int c:b) {
		System.out.print(c);
	}
	System.out.println(Arrays.toString(a)==Arrays.toString(b));
}
}
