package practice_1;

public class LexicoGraphy {
public static void main(String[] args) {
	String s1="madam";
	String s2="madama";
	int s=s1.compareTo(s2);
	if(s>0) {
		System.out.println(s1+"is greater than "+s2);
	}
	else if(s<0) {
		System.out.println(s1+"is less than "+s2);
	}
	else {
		System.out.println(s1+"is equal to "+s2);
	}
}
}
