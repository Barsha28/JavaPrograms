package day6_array;

public class ArrayRandomIMP {

	public static void main(String[] args) {
		int a[]= {2,4,49,32,35,36,81,45,25,50,9};
		int count;
		System.out.print("{");
		for(int i=1;i<=9;i++) {
			count=0;
		for(int j=0;j<a.length;j++) {
			if(a[j]%i==0) {
				count++;
			}
			}
		System.out.print(count +":"+i);
		if(i<=8) {
			System.out.print(",");
			
		}
	}
		System.out.println("}");

}
	}
