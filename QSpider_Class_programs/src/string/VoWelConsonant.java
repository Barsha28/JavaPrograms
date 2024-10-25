package string;

public class VoWelConsonant {
//	2.	WAP to print the vowels and consonants in a given String
public static void main(String[] args) {
	String s="MIlan";
	for (int i = 0; i < s.length(); i++) {
		if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u' &&
				s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U') {
			System.out.println("vowels"   +":"+s.charAt(i));
		}
		else {
			System.out.println("consonant   "+":"+s.charAt(i));
		}
	}
}
}
