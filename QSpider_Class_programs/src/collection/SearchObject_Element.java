package collection;

import java.util.ArrayList;

public class SearchObject_Element {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("vodka");
		a1.add("brandy");
		a1.add("bear");
		a1.add("rum");
		a1.add("whiskey");
		System.out.println(a1);
		ArrayList a2=new ArrayList();
		a2.add("dsdb");
		a2.add(1);
		System.out.println(a2);
		a1.addAll(a2);
		System.out.println(a1.contains("vodka"));
		System.out.println(a1.containsAll(a2));
		
		
		

	}

}
