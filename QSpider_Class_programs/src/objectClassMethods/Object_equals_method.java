package objectClassMethods;

public class Object_equals_method {
	String name;
	int age;

	public Object_equals_method(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return name + " " + age;
	}
	public boolean equals(Object obj) {
		 Object_equals_method m3=(Object_equals_method) obj;
		 return this.name==m3.name && this.age==m3.age;
	}

	public static void main(String[] args) {
		Object_equals_method m1 = new Object_equals_method("raha", 5);
		System.out.println(m1);
		Object_equals_method m2=new Object_equals_method("raha",5);
		System.out.println(m2);
		System.out.println(m1==m2);
		System.out.println(m1.equals(m2));
	}

}
