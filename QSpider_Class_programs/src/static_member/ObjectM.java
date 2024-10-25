package static_member;


public class ObjectM {
		int no=23;
		public static void m1() {
			ObjectM a2=new ObjectM();
			System.out.println(a2.no);
			int count =0;
			for(int i=1;i<=a2.no;i++) {
				if(a2.no%i==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(a2.no+" is prime no");
			}
			else {
				System.out.println(a2.no+" is not a prime no");
			}
		}
		public void m2() {
			if(no%2==0) {
				System.out.println(no+" is a even no");
			}
			else {
				System.out.println(no+" is a odd no");
			}
		}
		public static void main(String[] args) {
			ObjectM a1=new ObjectM();
			a1.m2();
			m1();
			
		}
	}
