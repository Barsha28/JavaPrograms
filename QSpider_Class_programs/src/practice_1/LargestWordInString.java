package practice_1;

public class LargestWordInString {
public static void main(String[] args) {
	String s="mom dad children malayalam",rev="";
	String []a=s.split(" ");
	
	String largest=a[0];

	for(String s1:a) {
		for(int i=s1.length()-1;i>=0;i--) {
			rev=rev+s1.charAt(i);
			if(rev.equals(s1)) {
				System.out.println("palindrome string "+s1);
			}
		}
		if(largest.length()<s1.length()) {
			largest=s1;
		}
	}
	System.out.println(largest);
}
}
