package string;

public class Asscii_value {
	public static void main(String[] args) {
		String s="JaVA";
		String []s1= s.split("");
		for(int i=0;i<s.length();i++) {
		 int a=s.charAt(i);	
		 System.out.println(a+" "+s1[i]);
		}
		
	}
}
