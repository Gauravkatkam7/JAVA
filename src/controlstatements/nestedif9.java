package controlstatements;

public class nestedif9 {
public static void main(String[] args) {
	
	int pem=400;
	int mem=700;
	
	if(pem>=350)
	{
		System.out.println("eligible for mains");
	
		if (pem>=800)
		{
			System.out.println("got selected for mains");
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
