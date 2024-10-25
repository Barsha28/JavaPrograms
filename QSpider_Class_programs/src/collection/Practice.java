package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Practice {

	public static void main(String[] args) {
		int a[]= {10,20,56,25,2};
		TreeSet t1=new TreeSet();
		for(int i=0;i<a.length;i++) {
			t1.add(a[i]);
			
		}
		System.out.println(t1);
//		for(Object obj:t1) {
//			System.out.print(obj+" ");
//		}
		Iterator a1=t1.descendingIterator();
		while(a1.hasNext()) {
			System.out.println(a1.next());
		}
		
		
	}

}
