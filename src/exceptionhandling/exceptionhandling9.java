package exceptionhandling;

public class exceptionhandling9 {

	public static void main(String[]args)
	{
		String s1="saurabh";
		
		try
		{
		System.out.println(s1.charAt(-1));
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("exception handled");
		}
		
		System.out.println("hi");
		System.out.println("hello");
		
		
		
	}
}
