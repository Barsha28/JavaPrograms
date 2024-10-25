package day6_array;

public class ArrayEqual {
	public static String m1(int a [],int b[]) {
		if(a.length!=b.length) {
			return "no";
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]!=b[i]) {
				return "no";
			}
		}
		return "yes";
			
		}
	public static void main(String[] args) {
		int []a= {10,20,30};
		int []b= {10,20,5};
		System.out.println(m1(a,b));

	}

}
