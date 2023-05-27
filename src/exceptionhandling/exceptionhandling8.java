package exceptionhandling;

public class exceptionhandling8 {

	public static void main(String[]args) {
		
		int a=100;
		int b=0;
		int c=0;
	
		try {

			 c=a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException handled");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException handled");
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("StringIndexOutOfBoundsException handled");
		}
		
		System.out.println("hi");
		System.out.println("hello");
}
}
