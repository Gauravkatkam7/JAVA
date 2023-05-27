package controlstatements;

public class nestedif2 {
	public static void main(String[] args) {
		
		
		int pem=301;
		int mem=501;
		
		if (pem>=300)
		{
			System.out.println("eligible for mains exam");
			
			if(mem>=500)
			{
				System.out.println("got selected in mains");
			}
			else
			{
				System.out.println("rejected from mains exam");
			}
		}
		
		
		else
		{
			System.out.println("rejected from mains exam:<300");
		}
	}

}
