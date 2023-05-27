package dailypractice8;

public class elseif {

	
	public static void main(String[] args) {
		
		int marks=30;
		
		if(marks>=60 & marks<=70)
		{
			System.out.println("distinction");
			
		}
		else if (marks>=50 & marks<=59)
		{
			System.out.println("1st class");
			
		}
		else if(marks>=40 & marks<=49)
		{
			System.out.println("2nd class");
		}
		else if(marks>=35)
		{
			System.out.println("pass");
			
		}
		else
		{
			System.out.println("fail");
		}
	}
}
