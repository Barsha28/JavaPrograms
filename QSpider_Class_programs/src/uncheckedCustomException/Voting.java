package uncheckedCustomException;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		System.out.println("voting started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age");
		int age=sc.nextInt();
		if(age>=18) {
			System.out.println("eligible");
		}
		else {
			try {
			throw new NotEligibleToVote();
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("voting ended");
	}

}
