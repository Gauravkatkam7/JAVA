package dailypractice4;

public class nestedif {
public static void main(String[] args) {
	
	int pem=300;
	int mem=600;
	
	if(mem>=300)
	{
		System.out.println("eligible for mains");
		if(mem>=500)
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
