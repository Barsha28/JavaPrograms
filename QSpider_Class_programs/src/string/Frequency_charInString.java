package string;

public class Frequency_charInString {
public static void main(String[] args) {
	//8.WAP to find the frequency of character in a given String 
	String s="barshabaaa";
	String s1=s.toUpperCase();
 char ch[]= s1.toCharArray();
 for(char ch1='A';ch1<'Z';ch1++) {
	 int count=0;
	 for (int i = 0; i < ch.length; i++) {
		if(ch1==ch[i] ){
			count++;
		}
	}
	if(count>0) {
		System.out.println(ch1+" "+count);
	}
 }
}
}
