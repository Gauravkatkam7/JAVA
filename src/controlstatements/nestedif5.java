package controlstatements;

public class nestedif5 {
public static void main(String[] args) {
	
	int pem=299;
	int mem=499;
	
	if (pem>=300)
	{
		System.out.println("eligible for mains");
		
		if (mem>=500)
		{
			System.out.println(" got selected");
		}
		else
		{
			System.out.println("rejected");
		}
	}
	else
	{
		System.out.println("not eligible for mains");
	}
}
}
