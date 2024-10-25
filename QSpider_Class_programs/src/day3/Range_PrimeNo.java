package day3;

public class Range_PrimeNo {

	public static void main(String[] args) {
		int rcount=0;
		for(int i=100;i>=1;i--) {
			int no=i;
			int count=0;
			for(int j=1;j<=no;j++) {
				if(no%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(no+"is prime no");
				rcount++;
			}
			else {
				System.out.println(no+"is not prime no");
			}
		}
		System.out.println(rcount+"   count of the total prime no");	
	}

}
