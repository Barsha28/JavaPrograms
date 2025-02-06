package practice_1;

public class LongestPalindrome {
public static void main(String[] args) {
	String s="madam level malayalam";
	String []a=s.split(" ");int longest=0;
	String longStr="";
	for(String s1:a) {
		String rev=new StringBuilder(s1).reverse().toString();
		if(rev.equals(s1)) {
			if(s1.length()>longest) {
				longStr=s1;
				longest=s1.length();
			}
		}
	}
	System.out.println(longStr+" longest plindrome");
}
}
