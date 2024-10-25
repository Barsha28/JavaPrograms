package string;

public class Reverse_wordString {

	public static void main(String[] args) {
		String s="she is a good girl";//o/p-girl good a is she 
		String[] s1=s.split(" ");
		for(int i=s1.length-1;i>=0;i--) {
			System.out.print(s1[i]+" ");
		}
		

	}

}
