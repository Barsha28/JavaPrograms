package day2;

public class Sum_even_no {

	public static void main(String[] args) {
		int sum=0;
		for(int i=10;i>=1;i--) {
			if(i%2==0)
				sum=sum+i;
		}
		System.out.println(sum+" "+"sum of even no");
	}

}
