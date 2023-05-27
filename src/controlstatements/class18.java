package controlstatements;

public class class18 {
public static void main(String[] args) {
	
	int pem=400;
	int mem=500;
	
	if(pem>300)
	{
		System.out.println("eligible for mains");
		if(mem>=600)
		{
			System.out.println("got selected");
			
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
