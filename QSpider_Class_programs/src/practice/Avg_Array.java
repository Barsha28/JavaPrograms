package practice;

public class Avg_Array {
public static void main(String[] args) {
	int a[]= {1,2,3};
	int no=a.length;
	int sum=0,avg=0;
	for (int i = 0; i < a.length; i++) {
		sum=sum+a[i];
	}
	avg=sum/no;
	System.out.println(avg);
	}
}
