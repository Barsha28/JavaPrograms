package day6_array;

public class ReturnArray {
	public static int[]returnArray(){
		int a[]= {10,20,30,40};
		return a;
	}
	public static void main(String[] args) {
		int a[]=returnArray();
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
