package stringConstantPool;

public class StringBuffer_StringBuilder {
	public static void main(String[] args) {
		StringBuilder s1=new StringBuilder("java");
		StringBuffer s2=new StringBuffer("manual");
		s1.append("class");
		s2.append("class");
		
		System.out.println(s1);
		System.out.println(s2);
		String s3="java";
		s3.concat("class");
		System.out.println(s3);
	}
}
