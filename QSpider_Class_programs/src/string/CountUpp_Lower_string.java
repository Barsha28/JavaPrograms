package string;

public class CountUpp_Lower_string {

	public static void main(String[] args) {
		String s="I Am TravelleR";
		String s1="";
		char []ch=s.toCharArray();int count=0;
		int count1=0,count2=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='a' && ch[i]<='z' ) {
				count++;
			}
			else if(ch[i]>='A' && ch[i]<='Z' ) {
				count1++;
			}
			
		}
		System.out.println("lower  :"+count);
		System.out.println("upper  :"+count1);
	}

}
