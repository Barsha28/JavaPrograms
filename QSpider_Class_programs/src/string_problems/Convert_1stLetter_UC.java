package string_problems;

public class Convert_1stLetter_UC {

	public static void main(String[] args) {
		String s = "this is a java class";
		String s1 = "";
		String a[] = s.split(" ");
		for (int i = 0; i < a.length; i++) {
			//String temp = a[i];
			for (int j = 0; j < a[i].length(); j++) {
				if (j == 0) {

					int uc = a[i].charAt(j) - 32;
					s1 = s1 + (char) uc;
				} else {
					s1 = s1 + a[i].charAt(j);
				}
			}
			if(i<a.length) {
				s1=s1+" ";
			}
		}
		System.out.println(s1+" ");
	}

}
