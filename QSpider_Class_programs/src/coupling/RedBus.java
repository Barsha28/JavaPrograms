package coupling;

public class RedBus implements Ticket{
	public void discount() {
		System.out.println("discount is 50%");
	}
	@Override
	public void ticket() {
		System.out.println("ticket is for redbus");
	}

}
