package string;

public class Lexicographically {
public static void main(String[] args) {
String s="madam";
String s1="madama";
int result = s.compareTo(s1);
System.out.println(result);
if(result>0) {
	System.out.println(s+" is greater than "+ s1);
}
else if(result<0) {
	System.out.println(s+" is less than "+ s1);	
}
else {
	System.out.println(s+" is equal to "+ s1);
}
}
}
