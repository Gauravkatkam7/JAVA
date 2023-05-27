package assignments;

public class leapyear {

	public static void main(String[] args) {
		
		int a=1800;
		
		if(a%4==0 &&(a%400==0 || a%100!=0))
		{
			System.out.println(a+" is leap year");
		}
		else
		{
			System.out.println(a+" is not a leap year");
		}
	}
}
