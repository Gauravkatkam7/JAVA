package dailypractice4;

public class elseif {
public static void main(String[] args) {
	
	int marks=34;
	
	if(marks>=50 & marks<=60)
	{
		System.out.println("distinction");
	}
	else if(marks>=40 & marks<=50)
	{
		System.out.println("1st class");
		
	}
	else if(marks>=35 & marks<=40)
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
