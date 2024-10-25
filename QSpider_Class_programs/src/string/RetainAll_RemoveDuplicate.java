package string;
import java.util.ArrayList;
public class RetainAll_RemoveDuplicate {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		for(int i=1;i<=10;i++) {
			a1.add(i);
		}
		System.out.println(a1);
		ArrayList a2=new ArrayList();
		for(int i=3;i<=8;i++) {
			a2.add(i);
		}
		System.out.println(a2);
		a1.retainAll(a2);
		System.out.println(a1);
	}

}
