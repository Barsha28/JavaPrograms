package day6_array;

public class Left_Shift {
	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50 };
		int rotation = 3;
		
		for(int j=0; j<rotation;j++) {
			
			
		int temp = a[0];

		for (int i = 0; i < a.length-1; i++) {
			a[i] = a[i + 1];

		}
		
		a[a.length-1]=temp;
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}

	}

}
