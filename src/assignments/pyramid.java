package assignments;

public class pyramid {

	public static void main(String[] args) {
		
			//upper pyramid
		//      
		for(int i=1; i<=10; i++)
		{ //                
			for(int k=9; k>=i; k--)
			{
				System.out.print(" ");
			}
			//      
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
		// lower pyramid
		for (int i=1; i<=10; i++)
		{
			for(int k=1; k<=i; k++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=10-i; j++)
			{
				System.out.print("* ");
				
			}
			System.out.println();
		}
		}
			
		}
	

