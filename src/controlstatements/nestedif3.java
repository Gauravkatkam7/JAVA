package controlstatements;

public class nestedif3 {
public static void main(String[] args) {
	
	int pem=300;
	int mem=400;
	
	if (pem>=300)
	{
		System.out.println("eligible for mains");
		
		if (mem>=500)
		{
			System.out.println("got selected");
			
		}
		else 
		{
			System.out.println("rejected from mains");
		}
	}
	else
	{
		System.out.println("rejected for mains");
	}
}
}
