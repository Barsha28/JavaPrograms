package string;

public class RemoveNumFromString {
public static void main(String[] args) {
	String s1="abgc123";
//	String s2=s1.replaceAll("[0-9]", " ");
//	System.out.println(s2);
	char ch[]=s1.toCharArray();
	for(char c1:ch) {
		if(c1>='a' && c1<='z') {
			System.out.print(c1);
		}
	}
}
}
