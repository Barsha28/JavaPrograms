package day6_array;

public class FactorialOfElementInanArray {
public static void main(String[] args) {
	int a[]= {5,4,3};
	for(int i:a) {
		System.out.println("each element "+i+ "in an array "+ m1(i));

	}
	}
public static int m1(int no) {
	int fact=1;
	for (int j = 1; j <=no; j++) {
		fact=fact*j;
	}
	return fact;

}
}
