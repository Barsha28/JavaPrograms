package day6_array;

public class RightShiftArray {
public static void main(String[] args) {
	int a1[]= {10,20,30,40};
	int temp=a1[a1.length-1];//40
	for (int i = a1.length-1; i >0; i--) {
		a1[i]=a1[i-1];//30,20,10
	}
	a1[0]=temp;//40
	for (int i = 0; i < a1.length; i++) {
		System.out.println(a1[i]+" ");
	}
}
}
