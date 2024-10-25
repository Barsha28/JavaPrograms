package map;

public class Student {
String name;
long ph;
int rollno;

public Student(String name,long ph,int rollno) {
	this.name=name;
	this.ph=ph;
	this.rollno=rollno;
	
}
public String toString() {
	return name+" "+ph+" "+rollno;
}
}
