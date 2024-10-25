package encapsulation_Prob;

public class Access_Balance {

	public static void main(String[] args) {
		Bank b=new Bank();
		b.setBalance(1000.0);
		System.out.println("balance present in account  "+b.getBalance());
		b.deposit();
		b.withDraw();
		System.out.println(b.acc_HoldeName);
	}

}
