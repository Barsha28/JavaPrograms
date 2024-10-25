package day5;

public class FibonnacciSeries {

	public static void main(String[] args) {
		int a=0,b=1,c=0;
		System.out.print(a+" ");
		System.out.print(b+" ");
		for (int i = 1; i <=10; i++) {
			c=a+b;//0+1=1,2,2+1
			a=b;//1,1
			b=c;
			System.out.print(c+" ");
		}
		
	}

}
