package stringMethod;

public class DomainName {
public static void main(String[] args) {
	String s="abc@gmail.com";
	System.out.println(s.substring(s.lastIndexOf('@')+1,s.lastIndexOf('.')));
	}
}
