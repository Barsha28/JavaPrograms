package string;

public class StringPalindrome {

	public static void main(String[] args) {
		String s="mom";
		String s1="";
		for(int i=s.length()-1;i>=0;i--) {
			s1=s1+s.charAt(i);
		}
		if(s.equals(s1)) {
			System.out.println(s+ " is a palindrome");
		}
		else {
			System.out.println(s+ "is not palindrome");
		}
		

	}

}
