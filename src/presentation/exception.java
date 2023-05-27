package presentation;

public class exception {

	public static void main(String[] args) {
		
		String s1="gaurav";
		
		try {
			System.out.println(s1.charAt(6));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			
			System.out.println("StringIndexOutOfBoundsException handled");
		}
		
		finally {
			System.exit(0);
		}
		System.out.println("hi");
	}
}
