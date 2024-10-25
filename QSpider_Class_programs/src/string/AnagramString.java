package string;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
	
	String s1="CAre";
	String s2="rac e";
	s1=s1.toLowerCase().replaceAll("\\s", "");
	s2=s2.replaceAll("\\s", "").toLowerCase();
	if(s1.length()!=s2.length()) {
	System.out.println("String is not anagram");
	}
	else {
	char[]ch1=s1.toCharArray();
	char[]ch2=s2.toCharArray();
	Arrays.sort(ch1);
	Arrays.sort(ch2);
	if(Arrays.equals(ch1, ch2)==true){
		System.out.println("both string are anagram");
	}
	else {
		System.out.println("not anagramksmks");
	}
	}
			}

}
