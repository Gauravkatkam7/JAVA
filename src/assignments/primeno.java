package assignments;

public class primeno {

	public static void main(String[] args) {
		
		int a=5;
		int count=0;//1
		
		for(int i=1;i<=10;i++)
		{
			if(a%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("prime no");
		}
		else
		{
			System.out.println("not prime no");
		}
	}
}
