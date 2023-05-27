package controlstatements;

public class nestedif11 {
public static void main(String[] args) {
	
	int pem=600;
	int mem=800;
	
	if (pem>=400)
	{
		System.out.println("eligible for mains");
		
		if(mem>=800)
		{
			System.out.println("got selected in  mains");
			
		}
		else
		{
			System.out.println("rejected");
		}
	}
	else
	{
		System.out.println("got rejected");
	}
}
}
