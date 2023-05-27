package controlstatements;

public class nestedif13 {
public static void main(String[] args) {
	
	int pem=500;
	int mem=800;
	
	if(pem>=300)
	{
		System.out.println("eligible for mains");
		
		if(mem>=700)
		{
			System.out.println("eligible for next round");
			
		}
		else
		{
			System.out.println("rejected");
		}
	}
	else
	{
		System.out.println("rejected for mains");
	}
}
}
