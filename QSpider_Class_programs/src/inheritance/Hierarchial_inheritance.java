package inheritance;

import java.util.Scanner;

class RBI{
public void interest_Rate() {
	System.out.println("all bank should have interest ");
	}
}
class SBI extends RBI{
	public void homeLoan() {
		System.out.println("home loan is 7.5%");
	}
}
class ICICI extends RBI{
	public void personalLoan() {
		System.out.println("personal loan is 9.5%");
	}
}
public class Hierarchial_inheritance {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("select your choice");
		System.out.println("1.sbi loan \n 2.Icici loan");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
		SBI s= new SBI();
		s.interest_Rate();
		s.homeLoan();
		break;
		case 2:
			ICICI i= new ICICI();
			i.interest_Rate();
			i.personalLoan();
			break;
			default:System.out.println("inavlid");
		}
	}

}
