package string;

public class ReverseStringArray {

	public static void main(String[] args) {
		String []st= {"java","smndsj","ksd"};
		for (int i = 0; i < st.length; i++) {
			String s=st[i];
			char ch[]=s.toCharArray();
			for(int j=ch.length-1;j>=0;j--) {
				System.out.print(ch[j]);
				
			}
			System.out.print(" ");
		}
	}
}

