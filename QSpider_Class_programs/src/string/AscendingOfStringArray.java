package string;

import java.util.Iterator;
import java.util.TreeSet;

public class AscendingOfStringArray {
public static void main(String[] args) {
	String s[]= {"sdnx","dxs","dsw"};
	TreeSet<String>set =new TreeSet<>();
	for (int i = 0; i < s.length; i++) {
		set.add(s[i]);
	}
	Iterator it=set.descendingIterator();
	while(it.hasNext()) {
		System.out.println(it.next());
		
	}
	
	System.out.println(set);
}
}
