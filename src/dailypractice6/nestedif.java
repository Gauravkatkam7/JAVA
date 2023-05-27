package dailypractice6;

public class nestedif {
public static void main(String[] args) {
	
	int pem=500;
	int mem=600;
	
	if (pem>=400)
	{
		System.out.println("eligible for mains");
		
		if(mem>=600)
		{
			System.out.println("eligible for interview");
			
		}
		else
		{
			System.out.println("disqualify");
		}
	}
	else
	{
		System.out.println("rejected");
	}
	
}
}
