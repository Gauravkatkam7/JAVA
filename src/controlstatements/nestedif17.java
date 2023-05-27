package controlstatements;

public class nestedif17 {
public static void main(String[] args) {
	
	int pem=400;
	int mem=600;
	
	if(pem>=300)
	{
		System.out.println("eligible for mains");
		
		if (mem>=600)
		{
			System.out.println("selected in main");
			
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
