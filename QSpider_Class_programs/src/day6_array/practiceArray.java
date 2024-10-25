package day6_array;


public class practiceArray {

	public static void main(String[] args) {
	int a[]= {9,4,5,25,3};
	for(int i=0;i<a.length;i++) {
		for(int j=1;j<a[i];j++) {
			if (a[i]==j*j) {
				System.out.println(a[i]);
			}
		}
		
		
	}
}
}

