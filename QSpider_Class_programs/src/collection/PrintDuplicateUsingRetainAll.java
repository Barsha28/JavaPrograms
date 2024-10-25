package collection;

import java.util.ArrayList;

public class PrintDuplicateUsingRetainAll {
public static void main(String[] args) {
	int a[]= {4,5,6,1,4,5,23,23};
	int b[]= {4,5,55,6,23,23};
	ArrayList a1=new ArrayList();
	a1.add(a);
	ArrayList a2 = new ArrayList();
	a2.add(b);
	a1.retainAll(a2);
	System.out.println(a2.toString()
			);
}
}
