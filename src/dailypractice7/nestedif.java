package dailypractice7;

public class nestedif {
	public static void main(String[] args) 
	
	{
		int sa=600;
		
		if(sa>=500)
		{
			System.out.println("no delivery charges");
			
			if(sa>=10000)
			{
				System.out.println("eligible for 10% discount");
				
			}
			else
			{
				System.out.println("no discount");
			}
		}
		else
		{
			System.out.println("delivery charges");
		}
		
		
	}
}
