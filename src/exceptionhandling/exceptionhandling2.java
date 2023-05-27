package exceptionhandling;

public class exceptionhandling2 {

	public static void main(String[] args) {
		
		int i1[]= {1,5,3,5};
		
		
		try {
			System.out.println(i1[4]);
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("ArrayIndexOutOfBoundsException handled");
		}
		
		System.out.println("good morning");
	}
}
