package controlstatements;

public class nestedif15 {
public static void main(String[] args) {
	
	int pem=400;
	int mem=600;
	
	if(pem>=300)
	{
		System.out.println("eligible for mains");
	
		if(mem>=500)
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
