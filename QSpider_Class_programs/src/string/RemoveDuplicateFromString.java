package string;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {
		/*String s="my name is khan";
		String s1="";
		
		for(int i=0;i<s.length();i++) {
			int count=0;
			for(int j=0;j<s1.length();j++) {
				if(s.charAt(i)==' ') {
					
				}
				else if(s.charAt(i)==s1.charAt(j)) {
					count++;
				}
			}
			if(count==0) {
				s1=s1+s.charAt(i);
			}
		}
		System.out.println(s1);*/
		
		
		String s="my name is khan";
		String s1="";
		char[]ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			int count=0;
			for(int j=0;j<i;j++) {
				if(ch[i]==' ') {
					s1=s1+s.charAt(i);
				}
				else if(ch[i]==ch[j] ) {
					count++;
				}
			}
			if(count==0) {
				System.out.print(ch[i]);
			}
		}
	}
}