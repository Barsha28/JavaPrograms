package string;

public class String_char {
	public static void main(String[] args) {
		String s="Javamava";
		System.out.println(s.length());
		for (int i = s.length()-1; i >=0; i--) {
			System.out.println(s.charAt(i)+":"+i);
			int a=s.charAt(i);
			System.out.println("ascii value");
			System.out.println(a+"  ="+s.charAt(i));
		}
		String s2=s.toUpperCase();
		System.out.println(s2);
		System.out.println(s2.toLowerCase());
		
	}
}
