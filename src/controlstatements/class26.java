package controlstatements;

public class class26 {
public static void main(String[] args) {
	
	int marks=55;
	
	if(marks>=56)
	{
		System.out.println("pass");
		
	}
	else if (marks>=60)
	{
		System.out.println("distinction");
		
	}
	else if (marks>=50 & marks<=55)
	{
		System.out.println("2nd class");
		
	}
	else if (marks>=40 & marks<=45)
	{
		System.out.println("1st class");
		
	}
	else
	{
		System.out.println("fail");
	}
}
}
