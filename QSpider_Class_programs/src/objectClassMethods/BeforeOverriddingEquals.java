package objectClassMethods;

public class BeforeOverriddingEquals {
	String name;
	int age;

	public BeforeOverriddingEquals(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return name + " " + age;
	}

	public static void main(String[] args) {
		BeforeOverriddingEquals m1 = new BeforeOverriddingEquals("raha", 5);
		System.out.println(m1);
		BeforeOverriddingEquals m2=new BeforeOverriddingEquals("raha",5);
		System.out.println(m2);
		System.out.println(m1==m2);
		System.out.println(m1.equals(m2));
	}


}
