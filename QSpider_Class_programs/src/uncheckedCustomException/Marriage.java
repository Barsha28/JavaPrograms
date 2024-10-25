package uncheckedCustomException;

import java.util.Scanner;

public class Marriage {

	public static void main(String[] args) throws NotEligibleToMarriage {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();
		if (age >= 21) {
			System.out.println("Eligible");
		} else {
			try {
				throw new NotEligibleToMarriage();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
