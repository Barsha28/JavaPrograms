package practice_1;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	String s1="care";
	String s2="rage";
	if(s1.length()==s2.length()) {
		char []ch1=s1.toCharArray();
		char []ch2=s2.toCharArray();
		 Arrays.sort(ch1);
		 Arrays.sort(ch2);
		 if(Arrays.equals(ch1, ch2)) {
			 System.out.println("anagram");
		 }
		 else {
			 System.out.println("both are not anagram");
		 }
	}
	else {
		System.out.println("dont check for anagram");
	}
}
}
