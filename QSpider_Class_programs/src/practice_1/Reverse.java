package practice_1;

public class Reverse {
public static void main(String[] args) {
	String s="i love my india";
	String s1[]=s.split(" "),rev="";
	for(String a:s1) {
		for(int i=a.length()-1;i>=0;i--) {
			System.out.print(a.charAt(i));
		}
		System.out.print(" ");
	}
}
}
