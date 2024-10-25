package polymorphism_prob;

import java.util.Scanner;

public class Imp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("select shape of your choice");
		System.out.println("1:area of circle \n 2:area of rectangle");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			Circle c=new Circle();
			c.calculateArea();
			break;
		case 2:
			Rectangular r=new Rectangular();
			r.calculateArea();
			break;
		default:
			System.out.println("select valid one");
		}
		

	}
}
