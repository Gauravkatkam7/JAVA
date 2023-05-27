package dailypractice5;

public class elseif {
public static void main(String[] args) {
	
	int marks=36;
	
	if(marks>=70 & marks<=80)
	{
		System.out.println("distinction");
		
	}
	else if (marks>=60 & marks<=69)
	{
		System.out.println("1st class");
		
	}
	else if (marks>=50 & marks<=59)
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
