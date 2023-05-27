package controlstatements;

public class class31 {
public static void main(String[] args) {
	
	int marks=61;
	
	if(marks>=60 & marks<65)
	{
		System.out.println("distinction");
	}
	else if(marks>=55 & marks<=59)
	{
		System.out.println("1 st class");
		
	}
	else if(marks>=40 & marks<=49)
	{
		System.out.println("2nd class");

	}
	else if(marks>35)
	{
		System.out.println("pass");
		
	}
	else 
	{
		System.out.println("fail");
	}
}
}
