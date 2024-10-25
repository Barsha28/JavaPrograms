package typeCasting;

public class Converting_loweToUpper {

	public static void main(String[] args) {
		String s="barsha";
		for(int i=0;i<s.length();i++) {
		int j=s.charAt(i)-32;
			char ch=(char) j;
		
			System.out.print(ch);
		}
	
//		char ch='a';
//		int c=ch-32;
//		char uc=(char) c;
//		System.out.println(uc);

	}
}


