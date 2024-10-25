package day2;

public class Count_digits {

	public static void main(String[] args) {
		int count=0;
		int no=165;
		while(no!=0) {
			no=no/10;
			count++;
			//int rem=no%10;
			//count++;
			//no=no/10;
		}
		System.out.println("count digits"+count);
	}

}
