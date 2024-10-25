package day6_array;

public class Char_arrayUpperLower {

	public static void main(String[] args) {
		char ch[]= {'a','=','H','*','k'};
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='a' && ch[i]<='z' || ch[i]>='A' && ch[i]<='Z') {
				System.out.println("alphabet character  "+ ch[i]);
			}
		}

	}

}
