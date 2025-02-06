package string;

public class LargestWord_String {

	public static void main(String[] args) {
		String s="this is a programming language";
		String []s1=s.split(" ");
		for (int i = 0; i < s1.length; i++) {
			String temp=s1[0];
			for (int j = i+1; j < s1.length; j++) {
				if(s1[i].length()<s1[j].length()) {
					temp=s1[i];
					s1[i]=s1[j];
					s1[j]=temp;
				}
			}
		}
//		for (int i = 0; i < s1.length; i++) {
//			System.out.println(s1[i]);
//		}
		System.out.println(s1[0]+"  :largest word in  String");//Programming

	}

}
/*	String s="barsha rani maharana";
String s1[]=s.split(" ");
String largest=s1[0];
for (int i = 0; i < s1.length; i++) {
	if(largest.length()<s1[i].length()) {
		largest=s1[i];
	}
}
System.out.println(largest+":"+"is the largest word");*/