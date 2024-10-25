package day5;

public class Perfect_no {

	public static void main(String[] args) {
		int no=16,sum=0;
		for(int i=1;i<no;i++) {
			if(no%i==0) {
				sum=sum+i;
			}
		}
		if(sum==no) {
			System.out.println(sum +"  is a perfect no");
		}
		else {
			System.out.println(sum+"  is not a perfect no");
		}

	}

}
