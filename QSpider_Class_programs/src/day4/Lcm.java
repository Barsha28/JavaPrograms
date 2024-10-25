package day4;

public class Lcm {

	public static void main(String[] args) {
		int a=15,b=6,gcd=1;
		for(int i=1;i<=a ;i++) {
			if(a%i==0 && b%i==0) {
				gcd=i;
			}
				}
		int lcm=(a*b)/gcd;
		System.out.println(lcm);
		}

}
