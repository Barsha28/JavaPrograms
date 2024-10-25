package day3;

public class Sum_PrimeNo {

	public static void main(String[] args) {
		int sum=0;
		for(int i=100;i>=1;i--) {
			int no=i;
			int count=0;
			for(int j=1;j<=no;j++) {
				if(no%j==0) {
					count++;
				}
			}
			if(count==2) {
				sum=sum+no;
			}
				}
		System.out.println(sum+" =  sum of the total prime no");
		}
}
