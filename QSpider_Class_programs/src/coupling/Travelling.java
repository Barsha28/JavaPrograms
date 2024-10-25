package coupling;
import java.util.Scanner;
public class Travelling {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Select one app");
		System.out.println("1:RedBus \n 2:AbhiBus");
		int app=sc.nextInt();
		Ticket t;
		switch(app) {
		case 1:
			t=new RedBus();
			t.ticket();
			RedBus r=new RedBus();
			r.discount();
			break;
		case 2:
			t=new AbhiBus();
			t.ticket();
			break;
			
		default:System.out.println("select valid input");
		}
		
			
	}

}
