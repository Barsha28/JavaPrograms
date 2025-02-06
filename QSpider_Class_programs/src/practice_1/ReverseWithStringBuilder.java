package practice_1;

public class ReverseWithStringBuilder {
public static void main(String[] args) {
	String s="i love my india";
	String s1[]=s.split(" ");
	for (int i = 0; i < s1.length; i++) {
		String a=s1[i];
		StringBuilder sb=new StringBuilder(a);
		System.out.print(sb.reverse()+" ");
	}
}
}
