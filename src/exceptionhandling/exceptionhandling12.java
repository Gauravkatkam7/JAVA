package exceptionhandling;

public class exceptionhandling12 {

	public static void main(String[]args)
	{
		String s1="katkam";
		
		int i1[]= {2,55,244};
		
		try {
		System.out.println(s1.charAt(9));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("StringIndexOutOfBoundsException handled");
		}
		try {
			System.out.println(i1[8]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException handled");
		}
		
		System.out.println("hi");
		
	}
}
