package collection;

import java.util.ArrayList;

public class ArrayListStudentObj {

	String name;
	int id;
	long c_no;
	public  ArrayListStudentObj(String name,int id,long c_no) {
		this.name=name;
		this.id=id;
		this.c_no=c_no;			
	}
	public String toString () {
		return name+" "+id+" "+c_no;
	}
	public static void main(String[] args) {
		ArrayList l1=new ArrayList();
		l1.add(new ArrayListStudentObj("barsha",1,5552326));
		l1.add(new ArrayListStudentObj("buna", 2, 2154854));
		System.out.println(l1.get(1));
		l1.set(1,"hjjk");
		for(Object obj:l1) {
			System.out.println(obj);
		}
		
		
	}

}
