package practice;

public class pal {
public static void main(String[] args) {
	String s="java mava dssv";
	char ch[]=s.toCharArray();
	for (int i = 0; i < ch.length; i++) {
		int count=0;
		for (int j = 0; j <i; j++) {
			if(ch[i]==' ') {
			
			}
			else if(ch[i]==ch[j]) {
				count++;
			}
		}
		if(count==0) {
			System.out.println(ch[i]);
		}
	}
	}
}
