package string;

public class AscendingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[]= {"java","sql","manual"};
		String temp="";
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i].length()>a[j].length()) {
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
