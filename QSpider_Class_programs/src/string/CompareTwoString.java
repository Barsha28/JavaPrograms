package string;

public class CompareTwoString {

	public static void main(String[] args) {
		String s1="barsha";
		String s2="Barsha";
		boolean isCompare=false;
		StringBuilder s3=new StringBuilder("barsha");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.compareTo(s2));
		System.out.println(s3.toString().equals(s1));
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)==s2.charAt(i)) {
				isCompare=false;
				break;
			}
		}
		System.out.println("both porgram  "+isCompare);
	}

}
