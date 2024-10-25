package day6_array;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class SwapHalfOfArray {
public static void main(String[] args) {
	int a[]= {5,4,1,2,7,5};
	int l=0,h=a.length-1;
	int temp=0;
	
	while(l<h) {
		temp=a[h];
		a[h]=a[l];
		a[l]=temp;
		l++;
		h--;
		}
	System.out.println(l);
	System.out.println(h);
	System.out.println(Arrays.toString(a));
	for (int i = 0; i <= h; i++) {
		int smallest1=a[i];
		//int smallest2=a[i+l];
		for (int j = i+1; j <=h; j++) {
			if(a[i]>a[j]) {
				smallest1=a[i];
				a[i]=a[j];
				a[j]=smallest1;
			}
			if(a[i+l]>a[j+l]) {
				smallest1=a[i+l];
				a[i+l]=a[j+l];
				a[j+l]=smallest1;
			}
			
		}
		}
	for (int i = 0; i <= a.length-1; i++) {
		System.out.println(a[i]);
	}
//	for (int i = l; i <= a.length-1; i++) {
//		int smallest=a[i];
//		for (int j = i+1; j <=a.length-1; j++) {
//			if(a[i]>a[j]) {
//				smallest=a[i];
//				a[i]=a[j];
//				a[j]=smallest;
//			}
//		}
//		}
//	for (int i = l; i <= a.length-1; i++) {
//		System.out.println(a[i]);
//
//	}

}
	}
