package string_problems;

public class practice {
public static void main(String[] args) {
	String s="this is java";
	String s1[]=s.split(" ");
	for (int j = 0; j < s1.length; j++) {
		char ch[]=s1[j].toCharArray();
		System.out.print(" ");
		for (int i = ch.length-1; i>=0; i--) {
			System.out.print(ch[i]);
		}	
	}
}
}
