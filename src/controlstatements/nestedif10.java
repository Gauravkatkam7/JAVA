package controlstatements;

public class nestedif10 {
public static void main(String[] args) {
	
	int pem=400;
	int mem=700;
	
	if (pem>=500)
	{
		System.out.println("eligible for mains");
		
		if (mem>=800)
		{
			System.out.println("got selected");
			
		}
		else
		{
			System.out.println("rejected in mains");
		}
	}
	else
	{
		System.out.println("rejected");
		
	}
}
}
