package dailypractice6;

public class elseif {

	public static void main(String[] args) {
		int marks=34;
		
		if(marks>=60 & marks<=70)
		{
			System.out.println("distinction");
			
		}
		else if (marks>=50 & marks<=60)
		{
			System.out.println("first class");
		}
		else if (marks>=40 & marks<=49)
		{
			System.out.println("2nd class");
			
		}
		else if (marks>=35)
		{
			System.out.println("pass");
			
		}
		else
		{
			System.out.println("fail");
		}
	}
}