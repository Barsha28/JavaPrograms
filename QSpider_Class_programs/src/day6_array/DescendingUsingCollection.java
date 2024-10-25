package day6_array;

import java.util.Iterator;
import java.util.TreeSet;

public class DescendingUsingCollection {
public static void main(String[] args) {
	int a[]= {100,2,3,59,25,2,63};
	TreeSet<Integer> ts=new TreeSet<Integer>();
	for(int b:a) {
		ts.add(b);
	}
	System.out.println(ts);
	Iterator<Integer> i=ts.descendingIterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
}
}
