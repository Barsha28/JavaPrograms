package objectClassMethods;

public class BeforeOverridingtoString {
	String name;
	int age;

	public BeforeOverridingtoString(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		BeforeOverridingtoString m1 = new BeforeOverridingtoString("raha", 5);
		System.out.println(m1);
	}


}
