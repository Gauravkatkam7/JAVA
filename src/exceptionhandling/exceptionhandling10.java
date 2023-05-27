package exceptionhandling;

public class exceptionhandling10 {

	public static void main(String[]args) {
		
		String s1[]= {"gaurav","katakam"};
		
		try {
			System.out.println(s1[3]);
			
		}
		catch(Exception E)
		{
			E.printStackTrace();
			System.out.println("Exception handled");
		}
		System.out.println("hi");
		System.out.println("hello");
	}
} 
