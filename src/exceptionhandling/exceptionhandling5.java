package exceptionhandling;

public class exceptionhandling5 {

	public static void main(String[] args) {
		
		String s1="gaurav";
		
		try {
		
		System.out.println(s1.substring(10));
		}
		catch(StringIndexOutOfBoundsException s)
		{
		
			System.out.println("StringIndexOutOfBoundsException handled");
		}
		
		System.out.println("helloooo");
	}
}
