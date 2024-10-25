package constructor;

public class Constructor_studentdetails {
	int id;
	String name;
	public Constructor_studentdetails() {
		this.id=1;
		this.name="barsha";
	}
	public Constructor_studentdetails(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public Constructor_studentdetails(String name,int id) {
		this.id=id;
		this.name=name;
	}
	
	public static void main(String[] args) {
		Constructor_studentdetails s1=new Constructor_studentdetails();
		Constructor_studentdetails s2=new Constructor_studentdetails(10, "sushma");
		Constructor_studentdetails s3=new Constructor_studentdetails("ayesha", 20);
		System.out.println("student 1");
		System.out.println(s1.id+"\n"+s1.name);
		System.out.println("student 2");
		System.out.println(s2.id+"\n"+s2.name);
		System.out.println("student 3");
		System.out.println(s3.id+"\n"+s3.name);
		
	}

}
