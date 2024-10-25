package numbers;

public class Oddnos {
public static void main(String[] args) {
	int no=4;
	if(no%2==0) {
		no=no-1;
	}
	for(int i=1;i<no*2;i++) {
		if(i%2==1) {
			System.out.println(i);
		}
		}
	}
}

