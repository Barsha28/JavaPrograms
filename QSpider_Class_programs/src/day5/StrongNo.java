package day5;

public class StrongNo {

	public static void main(String[] args) {
			for(int j=200;j>=1;j--) {
			int no=j,sum=0,no1=no;
			while(no>0) {
			int rem=no%10;//5
			int fact=1;
			for(int i=1;i<=rem;i++) {
				fact=fact*i;//1,2,6,24,120		
				}
			sum=sum+fact;//144+1
			no=no/10;
			}

			if(no1==sum) {
				System.out.println("Strong no  "+sum);
			}

		}
	}

}
