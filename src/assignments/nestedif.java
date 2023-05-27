package assignments;

public class nestedif {
public static void main(String[] args) {
	
	int shoppingamount=501;
	
	if(shoppingamount>=500)
	{
		System.out.println("no deliver charges");
		
		if(shoppingamount>=10000)
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
