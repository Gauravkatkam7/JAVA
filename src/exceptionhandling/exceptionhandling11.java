package exceptionhandling;

public class exceptionhandling11 {

	public static void main(String[]args) {
		
		int a=100;
		int b=0;
		int c=0;
		
		try {
			c=a/b;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Exception handled");
		}
		System.out.println("hi");
	}
}
