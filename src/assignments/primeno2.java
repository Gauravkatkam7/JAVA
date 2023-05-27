package assignments;

public class primeno2 {

	public static void main(String[] args) {
	
		for(int i=2;i<=100;i++)//2,3,4,5
		{
			int count=0;//
			for(int j=2;j<i;j++)//
			{
				if(i%j==0)
			{
				count++;
			}
			
		}
			if (count==0)
			{
				System.out.println("prime number="+i);
			}
			else
			{
				System.out.println("not prime="+i);
			}
	}
}
}