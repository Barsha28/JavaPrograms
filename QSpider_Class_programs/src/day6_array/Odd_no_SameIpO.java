package day6_array;

import java.util.Scanner;

public class Odd_no_SameIpO {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter a no");
			int no=sc.nextInt();
			int a=1,count=0;
			System.out.println(no);
			while(count!=no) {
				if(a%2==1) {
				System.out.print(a+" ");
				count++;
				}
				a++;
//				if(count==no) {
//					break;
				}
			}
			
		}
