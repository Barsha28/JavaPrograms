package day6_array;

public class Vowel_Char {

	public static void main(String[] args) {
		char ch[]= {'a','e','u','z'};
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||
					ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U') {
				System.out.println(ch[i]);
			}
		}
	}

}
