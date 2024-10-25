package objectClassMethods;

public class Object_toStringMethod {
	String name;
	int age;

	public Object_toStringMethod(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return name + " " + age;
	}

	public static void main(String[] args) {
		Object_toStringMethod m1 = new Object_toStringMethod("raha", 5);
		System.out.println(m1);
	}

}
