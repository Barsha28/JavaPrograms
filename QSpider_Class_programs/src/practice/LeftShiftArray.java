package practice;

import java.util.Scanner;

public class LeftShiftArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println();
		        int[] a = {1, 2, 3, 4, 5};
		        int n = a.length;
		        
		        // Left shift the array by one position
		        int first = a[0];
		        for (int i = 0; i < n - 1; i++) {
		            a[i] = a[i + 1];
		        }
		        a[n - 1] = first;
		        
		        // Print the shifted array
		        for (int i : a) {
		            System.out.print(i + " ");
		        }
		    }


}
