package day5;

import java.util.Scanner;

public class Perfect_Square {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no");
		int no=sc.nextInt();
		boolean flag=false;
		for(int i=1;i<=no;i++) {
			if(i*i==no) {
				flag=true;
				break;
			}
		}
		if(flag) {
			System.out.println(no+" perfect no");
		}
		else {
			System.out.println(no+" not a perfect no");
		}
	}
	}


