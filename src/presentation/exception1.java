package presentation;

public class exception1 {

	public static void main(String[] args) {
		
          String s1="gaurav";
		
		try {
			System.out.println(s1.charAt(6));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("StringIndexOutOfBoundsException handled");
		}
		catch(ArrayIndexOutOfBoundsException f)
		{
			System.out.println("ArrayIndexOutOfBoundsException handled");
		}
		catch(ArithmeticException f)
		{
			System.out.println("ArithmeticException handled");
		}
		catch(Exception s)
		{
			
		}
		System.out.println("hi");
		
		
	}
	}
}
