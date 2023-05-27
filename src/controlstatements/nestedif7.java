package controlstatements;

public class nestedif7 {
public static void main(String[] args) {
	
	int prelims=400;
	int mains=501;
	if (prelims>=300)
	{
		System.out.println("selected for mains");
	
		if (mains>=500)
		{
			System.out.println("got selected for next round");
			
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
