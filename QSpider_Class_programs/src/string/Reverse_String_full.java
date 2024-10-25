package string;

public class Reverse_String_full {

	public static void main(String[] args) {
		String s="she is a good girl";//o/p-girl good a is she 
		char[]s1=s.toCharArray();
		for(int i=s1.length-1;i>=0;i--) {
			System.out.print(s1[i]);
		}


	}

}
