package exceptionhandling;

public class exceptionhandling13 {

	public static void main(String[]args)
	{
		String s1="katkam";
		
		int i1[][]= {{1,2,6},{2,5,9}};
		
		try {
			
			try {
				System.out.println(i1[5][9]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("ArrayIndexOutOfBoundsException handled");
			}
			System.out.println(s1.charAt(8));
		}
			catch(StringIndexOutOfBoundsException e)
			{
				System.out.println("StringIndexOutOfBoundsException handled");
				
			}
		System.out.println("hi");
	}
}
