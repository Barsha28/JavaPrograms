package practice_1;

public class RemoveNoFromString {
public static void main(String[] args) {
	String s="abc125";int sum=0;
	char ch[]=s.toCharArray();
	for(char c1:ch) {
		if(c1>='1' && c1<='9') {
			sum=sum+c1-48;
		}
	}
	System.out.println(sum);
}
}
