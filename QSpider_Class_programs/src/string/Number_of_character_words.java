package string;

public class Number_of_character_words {

	public static void main(String[] args) {
		String s="today every one answered";
		String[]a=s.split(" ");
		System.out.println(a.length);
		for(int i=0;i<a.length;i++) {
			int no=a[i].length();
			System.out.println(a[i]+" " +no);
		}
	}

}
