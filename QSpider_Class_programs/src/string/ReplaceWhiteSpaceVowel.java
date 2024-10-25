package string;

public class ReplaceWhiteSpaceVowel {
//3.	WAP to replace all the vowels in a given String with white space
	public static void main(String[] args) {
		String s="MIlanaap";
		String s1="";
		s1=s.replaceAll("[aeiouAEIOU]", ""+' ');
		System.out.println("after repalce  :"+s1);
	}
}
