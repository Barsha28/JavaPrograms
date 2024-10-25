package day4;

import java.util.Scanner;

public class LCM_TwoNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two no");
		int a=sc.nextInt(),b=sc.nextInt();
		int c=a>b?a:b;
			if(c%a==0 && c%b==0) {
				System.out.println(c+" is the lcm of two no");
					}
		
		else {
			for(int i=1;i<=c;i++) {
				c++;
				if(c%a==0 && c%b==0) {
					break;
				}
			}
			System.out.println(c+"  is the lcm of two no");
			}
		
	}

}
