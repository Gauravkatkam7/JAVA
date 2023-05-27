package dailypractice9;

public class nestedif {
public static void main(String[] args) {
	

	int sa=400;
 
	if(sa>=300)
   {
		System.out.println("no charges");
	   
		if(sa>=1000)
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
		System.out.println("50 delivery charges");
	}

}
}