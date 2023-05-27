package exceptionhandling;

public class exceptionhandling6 {

	public static void main(String[] args) {
		
		String s1="gaurav";
		
		try {
		System.out.println(s1.charAt(7));  //riskycode
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
	
		System.out.println("hi");
		System.out.println("hello");
	}
}
