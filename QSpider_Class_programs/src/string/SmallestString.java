package string;

public class SmallestString {

	public static void main(String[] args) {
	String s[]= {"java","sql","api","manual"};
	String Ssmall=s[0];
	int smallest=s[0].length();
	for(int i=0;i<s.length;i++) {
		if(s[i].length()<smallest) {
			Ssmall=s[i];
		}
		
	}
	System.out.println(Ssmall);
	
	}
//System.out.println(s[i]);
	}


