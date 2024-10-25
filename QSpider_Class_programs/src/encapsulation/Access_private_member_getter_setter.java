package encapsulation;

public class Access_private_member_getter_setter {

	public static void main(String[] args) {
		Setter_method sm= new Setter_method();
		sm.setCh('a');
		sm.setS("barsha");
		
		System.out.println(sm.getB());
		System.out.println(sm.getS());
		System.out.println(sm.getCh());

	}

}
