package collection;

import java.util.PriorityQueue;

public class PriorityQueue_ {
public static void main(String[] args) {
	PriorityQueue q1=new PriorityQueue();
	q1.add("HTML"); 
	q1.add("CSS"); 
	q1.add("SOAP"); 
	q1.add("AWS"); 
	q1.add("Selenium"); 
	System.out.println(q1.peek()); 
	System.out.println(q1.poll()); 
	System.out.println(q1.contains("AWS")); 
	while(q1.peek()!=null) 
	{ 
	System.out.println(q1.poll()); 
	} 
	 System.out.println("After while loop : "+q1); 
	}
}
