package day3;

public class Factor {

	public static void main(String[] args) {
		int no=25;//21
		for(int i=1;i<=no;i++) {
			if(no%i==0) {
				System.out.println(i);
			}
		}
	}

}
