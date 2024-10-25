package constructor;

public class Employee_details {
int id;
String name;
public Employee_details() {
	this.id=10;
	this.name="name";
}
public Employee_details(int id,String name) {
	this.id=id;
	this.name=name;
}
public Employee_details(String name,int id) {
	this.id=id;
	this .name=name;
		
}
public void display() {
	System.out.println("name :"+name);
	System.out.println("id :"+id);
}
public static void main(String[] args) {
	Employee_details e1=new Employee_details();
	Employee_details e2= new Employee_details(101, "barsha");
	Employee_details e3=new Employee_details("snxjs", 3);
	e1.display();
	e2.display();
	e3.display();
}
	

}
