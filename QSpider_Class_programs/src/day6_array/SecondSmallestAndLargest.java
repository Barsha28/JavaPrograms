package day6_array;

import java.util.TreeSet;

public class SecondSmallestAndLargest {
public static void main(String[] args) {
	int a[]= {1,52,69,89,41,22,33};
	TreeSet<Integer> ts=new TreeSet<Integer>();
	for(int b:a) {
		ts.add(b);
	}
	Object[] arr=ts.toArray();
	System.out.println(arr[1]);
	System.out.println(arr[a.length-2]);
	}
}
