package exceptionhandling;

public class exceptionhandling7 {

	public static void main(String[] args) {
		
		int i1[]= {1,4,9,10};
		
		try {
		System.out.println(i1[9]);
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("StringIndexOutOfBoundsException handled");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException handled");
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException handled");
		}
		
		System.out.println("good morning");
		System.out.println("good night");
	}
}
