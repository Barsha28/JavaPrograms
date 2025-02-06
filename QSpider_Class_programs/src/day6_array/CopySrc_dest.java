package day6_array;

public class CopySrc_dest {
public static void main(String[] args) {
	char a[]= {'a','b','c','a','f','e'};
	char b[]=new char[4];
	System.arraycopy(a, 2, b, 0, 4);
	System.out.println(String.valueOf(b));
}
}
