package collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class AddingElement_Collection {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add('a');
		a1.add('b');
		a1.add('c');
		a1.add('d');
		System.out.println(a1);
//		System.out.println("---------------------------");
//		ArrayList a2=new ArrayList();
//		a2.add('e');
//		a2.add('f');
//		a2.add('g');
//		a2.add('h');
//		System.out.println(a2);
		//Adding single object 
//		a1.add(a2);
//		System.out.println(a1);
		//Adding all element 
//		a1.addAll(a2);
//		System.out.println(a1);
		//index
//		a1.add(1,a2);
//		System.out.println(a1);
		 //Traversing list through Iterator  
//		Iterator itr=a1.iterator();
//		while(itr.hasNext()) {
//		System.out.println(itr.next());
//		}	
		for(Object obj:a1) {
			System.out.println(obj);
		}
	}
}
