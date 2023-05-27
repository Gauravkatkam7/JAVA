
package dailypractice8;

public class nestedif {

	public static void main(String[] args) {
		
		int sa=600;
	      
		if(sa>=500)
		{
			System.out.println("free delivery");
			
			if(sa>=10000)
			{
				System.out.println("10% discount");
			}
			else
			{
				System.out.println("no discount");
			}
		}
		
		else
		{
			System.out.println("50rs delivery charges");
		}
	
	}
}
