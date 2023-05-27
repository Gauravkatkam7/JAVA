package controlstatements;

public class nestedif12 {
public static void main(String[] args) {
	
	int pem=400;
	int mem=700;
	
	if(pem>=300)
	{
		System.out.println("eligible for mains");
		
		if (mem>=800)
		{
			System.out.println("selected in mains");
			
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
