package assignments;

public class palindromenumber1 {

	public static void main(String[] args) {

		int no=121;
		int temp=no;//121
		int rev=0,rem;
		while(temp!= 0)
		{

		rem=temp%10;//1%10=1

		rev=rev*10+rem;//12*10+1=121 
		temp=temp/10;//1/10=0
		}

		if(no==rev)

		{
			System.out.println(no+" is palindrome number");
		}
		else

		{
			System.out.println(no+" is not a palidrome number");
		}

		
	}
}
