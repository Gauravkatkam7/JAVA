package dailypractice2;

public class elseif {
public static void main(String[] args) {
	
	int marks=101;
	
	
	 if(marks>=400 & marks<=500) {
		System.out.println("distinction");
		
	}
	else if (marks>=200 & marks<=300)
	{
		System.out.println("1st class");
		
	}
	else if (marks>=100 & marks<=200)
	{
		System.out.println("2nd class");
		
	}
	else if(marks>=100)
	{
		System.out.println("pass");
		
	}
	else
	{
		System.out.println("fail");
	}
}
}
