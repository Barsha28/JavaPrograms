package encapsulation_Prob;

public class Bank {
	public String acc_no="ICICI08963333";
	public String acc_HoldeName="Barsha";
	private double balance;
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	public void deposit() {
		int a=1000,b=10000;
		System.out.println("after deposit balance  "+(a+b));
	}
	
	public void withDraw() {
		int a=1000,b=10000;
		System.out.println("after withdraw balance  "+(b-a));
	}
}
