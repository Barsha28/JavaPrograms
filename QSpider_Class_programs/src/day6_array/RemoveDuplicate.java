package day6_array;

public class RemoveDuplicate {
public static void main(String[] args) {
	int a[]= {1,2,3,2,3,3,5,5};
	for (int i = 0; i < a.length; i++) {
		int count=0;
		for (int j = i+1; j < a.length; j++) {
			if(a[i]==a[j]) {
				count++;
			}
		}
		if(count==0) {
			System.out.println(a[i]);
		}
	}
	}
}
