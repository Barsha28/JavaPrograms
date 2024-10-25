package string;

public class NoOfSpacespInString {
//4.	WAP to count the no. of spaces present in a given String
	public static void main(String[] args) {
		String s="dcmd  fdfk fkw";
		int spacecount=0;
		char ch[]=s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(i==' ') {
				spacecount++;
		}
	}
		System.out.println(spacecount);
		/*
		 * String s="dcmd  fdfk fkw"; int spacecount=0; for (int i = 0; i < s.length();
		 * i++) { if(Character.isWhitespace(s.charAt(i))) { spacecount++; } }
		 * System.out.println(spacecount);
		 */
	}
}
