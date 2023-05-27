package assignments;

public class palindromenumber2 {

public static void main(String[] args) {
		
		
		int orgNum=121;
		int revNum=0;//24
	                            //3
		for (int i=orgNum;i>0;i=i/10 ) 
		{
		int rem =i%10; //3
		revNum=revNum*10 + rem;//2243
		}
	
		if(orgNum==revNum)
		{
			System.out.println("given number is palindrome");
		}
		else
		{
			System.out.println("given number is not palindrome");
		}
		
	}
}
