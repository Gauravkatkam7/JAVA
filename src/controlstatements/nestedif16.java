package controlstatements;

public class nestedif16 {
public static void main(String[] args) {
	
	int pem=300;
	int mem=500;
	
	if (pem>=300)
	{
		System.out.println("eligible for mains");
		
		if(mem>=700)
		{
			System.out.println("got selected");
			
		}
		else
		{
			System.out.println("rejected");
		}
	}
	else
	{
		System.out.println("rejected");
	}
}
}
