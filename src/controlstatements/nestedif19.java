package controlstatements;

public class nestedif19 {
public static void main(String[] args) {
	
	int pem=400;
	int mem=600;
	
	if(pem>=300)
	{
		System.out.println("eligible for mains");
		if(mem>700)
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
