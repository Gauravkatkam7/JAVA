package controlstatements;

public class class39 {
public static void main(String[] args) {
	
	float per=40.3f;
	if (per>=60.4 & per<=65.0)
	{
		System.out.println("distinction");
		
	}
	else if(per>=55.3f & per<=60.3f)
	{
		System.out.println("1st class");
		
	}
	else if(per>=40.3f & per<=45.2f)
	{
		System.out.println("2nd class");
		
	}
	else if (per>=35.0f)
	{
		System.out.println("pass");
		
	}
	else
	{
		System.out.println("fail");
	}

}
}