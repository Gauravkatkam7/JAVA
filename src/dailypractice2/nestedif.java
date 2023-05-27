package dailypractice2;

public class nestedif {
public static void main(String[] args) {
	
	int SA=10001;
	
	if(SA>=500)
	{
		System.out.println("no deliver charges");
		
		if(SA>10000)
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
		System.out.println("50rs deliver charges");
	}
}
}
