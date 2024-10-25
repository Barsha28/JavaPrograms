package day6_array;

public class Perfect_square_Array {

	public static void main(String[] args) {
		int a[]= {25,9,27,49};
		for(int i=0;i<a.length;i++) 
		{
			for(int j=1;j<a[i];j++)
			{
				if(j*j==a[i]) 
				{
					System.out.println("perfect square "+a[i]);
				}
			}
		}

	}

}
