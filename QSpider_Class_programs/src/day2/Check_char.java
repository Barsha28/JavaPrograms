package day2;

public class Check_char {

	public static void main(String[] args) {
		char ch='$';
		if((ch>='A' && ch<='Z' )||(ch>='a' && ch<='z')) {
			System.out.println("alphabet"+ch);
		}
		else if(ch>=0 && ch<10) {
			System.out.println("digits"+ch);
		}
		else {
			System.out.println("special character"+ch);
		}

	}

}
