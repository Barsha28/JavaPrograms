package string;

public class CountNoOfWords {
public static void main(String[] args) {
	String s=" i am java ";
	s=s.trim();
	String[]s1=s.split(" ");
	int words=s1.length;
	System.out.println("no of words "+words);
}
}
