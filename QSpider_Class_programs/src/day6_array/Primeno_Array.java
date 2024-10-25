package day6_array;

public class Primeno_Array {

	public static void main(String[] args) {
		int a[] = { 2, 3, 4, 9, 6, 11, 25, 31 };

		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 1; j <= a[i]; j++) {

				if (a[i] % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println("its a prime no  " + a[i]);
			}
		}
	}

}
