package string;


public class longest {
	// to count longest word from a string
public static void main(String[] args) {
	String s="jAva DeveloPment dclm";
	String s1[]=s.split(" ");
	int max=0;
	int no=0;
	for(int i=0;i<s1.length;i++) {
		if(s1[i].length()>max) {
			max=s1[i].length();
			no=i;
		}
	}
	System.out.println(s1[no]+"-"+max);
	
}
}
