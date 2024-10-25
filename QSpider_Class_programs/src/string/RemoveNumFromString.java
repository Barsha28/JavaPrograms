package string;

public class RemoveNumFromString {
public static void main(String[] args) {
	String s1="abgc123";
//	String s2=s1.replaceAll("[0-9]", " ");
//	System.out.println(s2);
	String s2="";int sum=0;
	for(int i=0;i<s1.length();i++) {
		char ch=s1.charAt(i);//a
		if(ch<'a' || ch>'z') {//a<0
			int a = 0;
			ch=(char) a;
			sum=sum+ch;
			s2=s2+ch;
		}
		
	}
	System.out.println(sum);
	
}
}
