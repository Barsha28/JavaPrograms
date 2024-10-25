package abstraction;

import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("select one choice");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			Swiggy s=new Swiggy();
			s.biriyani_food();s.pasta_food();
		case 2:
			Zomato z=new Zomato();
			z.biriyani_food();
			z.pasta_food();
		}
		
	}

}
