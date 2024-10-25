package practice;

public class PerfectSquare {

	public static void main(String[] args) {
		int m = 1, n = 50;
		for (int i = m; i <= n; i++) {
//			for (int j = 1; j < m; j++) {
//				if (j * j == m) {
//					System.out.println("it is perfect square of- " + j + " " + m);
//				}
//			}
			int j=1;
			while (j<m) {
				if (j * j == m) {
					System.out.println("it is perfect square of- " + j + " " + m);
				}
				j++;
			}
			m++;
		
		}
	}

}
