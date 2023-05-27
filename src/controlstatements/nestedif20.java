package controlstatements;

public class nestedif20 {
public static void main(String[] args) {
	
	int pem=400;
	int mem=800;
	
	if(pem>=500)
	{
		System.out.println("eligible for mains");
		if (mem>=700)
		{
			System.out.println("selected");
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
