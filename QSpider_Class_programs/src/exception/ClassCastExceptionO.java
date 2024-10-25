package exception;

public class ClassCastExceptionO extends Sample{

	public static void main(String[] args) {
		int b=20;
		Sample c1=new Sample();
		try {
			ClassCastExceptionO c2=(ClassCastExceptionO)c1;
			System.out.println(c2.a);
			}
		catch(ClassCastException e1) {
			System.out.println(e1.getMessage());
		}
	}

}
