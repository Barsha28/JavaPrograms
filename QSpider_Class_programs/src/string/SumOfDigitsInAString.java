package string;

public class SumOfDigitsInAString {
public static void main(String[] args) {
	String s1="Ab12s36";
	int sum=0;
	for (int i = 0; i < s1.length(); i++) {
		if(s1.charAt(i)>='0' && s1.charAt(i)<='9') {
			sum=sum+(int)s1.charAt(i)-48;
		}
	}
	System.out.println(sum);
//	int count = 0;
//	for(int i = 0; i < str.length(); i++) {
//		char ch = str.charAt(i);
//		if(Character.isDigit(ch)) {
//			count = count+(int) (ch) - 48;
//		}
//	}
//	System.out.println(count);

			
}
}
