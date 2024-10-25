package day6_array;

public class Sort_Array_Asc {

	public static void main(String[] args) {
		int a[]= {15,20,30,0,5,6};
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("array in ascending order");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] +" ");
		}

	}

}
