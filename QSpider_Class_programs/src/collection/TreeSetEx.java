package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		TreeSet t1=new TreeSet();
//		t1.add('a');
//		t1.add('a');
//		t1.add('v');
//		t1.add('s');
		for(int i=1;i<=10;i++) {
			t1.add(i);
		}
		
		System.out.println(t1.size());
		Iterator j=t1.iterator();
		while(j.hasNext()) {
			System.out.println(j.next());
		}
	}
	

}
