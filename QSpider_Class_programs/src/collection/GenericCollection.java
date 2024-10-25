package collection;

import java.util.ArrayList;

public class GenericCollection {

	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(12);
		a1.add(2);
		a1.add(25);
		a1.add(89);
		System.out.println(a1);
		
		for(Integer i:a1) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		

	}

}
