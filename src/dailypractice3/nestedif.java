package dailypractice3;

public class nestedif {
public static void main(String[] args) {
	
	int pem=500;
	int mem=600;
	
	if(pem>=400)
	{
		System.out.println("eligible for mains");
		if(mem>=500)
		{
			System.out.println("got selected");
		}
		else
		{
			System.out.println("rejected in mains");
		}
	}
	else
	{
		System.out.println("rejected");
	}
}
}
