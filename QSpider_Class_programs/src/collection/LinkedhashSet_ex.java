package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;

public class LinkedhashSet_ex {

	public static void main(String[] args) {
		LinkedHashSet l1=new LinkedHashSet();
		l1.add("java");
		l1.add(1);
		l1.add("java");
		l1.add(null);
		l1.add(null);
		l1.add(2);
		System.out.println(l1);
		Iterator i1=l1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
	}

}
