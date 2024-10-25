package objectClassMethods;

public class Employee {
 String name;
 long c_no;
 int sal;
public Employee(String name, long c_no, int sal) {
	this.name = name;
	this.c_no = c_no;
	this.sal = sal;
}
public String toString() {
	return name+" "+c_no+" "+sal;
}
public boolean equals(Object obj) {
	Employee e1=(Employee)obj;
	return this.name==e1.name && this.c_no==e1.c_no && this.sal==e1.sal;
}
public int hashcode() {
	return (int)c_no ;
}
 public static void main(String[] args) {
	 Employee e2=new Employee("barsha", 321465565, 45000);
	 Employee e3=new Employee("sushma", 323565,50000);
	 System.out.println(e2);
	 System.out.println(e3);
	 System.out.println(e2.equals(e3));
	 System.out.println(e2.hashcode());
	 System.out.println(e3.hashcode());
}
}
