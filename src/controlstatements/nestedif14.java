package controlstatements;

public class nestedif14 {
public static void main(String[] args) {
	
	int pem=400;
	int mem=500;
	
	if(pem>=300)
	{
		System.out.println("eligible for mains");
		if(mem>=700)
		{
			System.out.println("got selected");
			
		}
		else
		{
			System.out.println("not selected");
		}
	}
	else
	{
		System.out.println("rejected");
	}
}
}
