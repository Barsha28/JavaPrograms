package string;


public class Count_Occurance_OfCharacter_String {

	public static void main(String[] args) {
		String s="dataaaa1111dd";
		char ch[]=s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int count=0;
			for (int j = 0; j < i; j++) {
				if(ch[i]==ch[j]) {
					count++;
				}
			}
			System.out.println(ch[i]+" :"+count);
		}

	}

}
