package day6_array;

import java.util.Arrays;

public class AscendingArray {

	public static void main(String[] args) {
		int a[]= {100,2,3,59,25,2,63};
		
		for (int i = 0; i < a.length; i++) {
			int temp=0;
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
			
		}
		System.out.println(Arrays.toString(a));
		/*
		 * for (int j = 0; j < a.length; j++) { System.out.println(a[j]); }
		 */
	}

}
