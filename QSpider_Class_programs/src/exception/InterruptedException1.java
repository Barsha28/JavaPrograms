package exception;

public class InterruptedException1 {

	public static void main(String[] args) throws InterruptedException {
		for(int i=0;i<=5;i++) {
			System.out.println("*");
			Thread.sleep(2000);
		}

	}

}
