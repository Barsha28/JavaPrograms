package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class SortElement_usingTreeSet {

	public static void main(String[] args) {
		TreeSet t1=new TreeSet();
		for(int i=10;i>=1;i++) {
			t1.add(i);
		}
		System.out.println(t1);
		Iterator j=t1.descendingIterator();
		while(j.hasNext()) {
			System.out.println(j.next());
		}

	}

}
