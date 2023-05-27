package assignments;

public class findhighestdigit{

	public static void main(String[] args) {
		
		int s1=123445;
		int highestdigit=0;
		
		for(int i=s1;i>0;i=i/10)
		{
			int rem=s1%10;
			
			if(highestdigit<rem)
			{
				highestdigit=rem;//5,
			}
		}
		System.out.println(highestdigit);
		
		
		
		
		
		
		
		
		
		
		
	}
}
