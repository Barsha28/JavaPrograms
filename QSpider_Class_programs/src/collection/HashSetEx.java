package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String[] args) {
		HashSet a1=new HashSet();
		a1.add(4);
		a1.add('k');
		a1.add("ajdsj");
		a1.add('h');
		a1.add(null);
		a1.add("java");
		a1.add("java");
		a1.add(2);
//		ArrayList a=new ArrayList(a1);
//		a.add(2,"dkcf");
		System.out.println(a1);
		Iterator i=a1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
