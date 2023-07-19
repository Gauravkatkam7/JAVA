package practice;



public class reverseNumber1 {

	public static void main(String[] args) {
		
	
	int a=121;
	int rev=0;
	for(int i=a;i>0;i=i/10)
	{
		int rem=i%10;//1
		rev=rev*10+rem;//4321
	}
	System.out.println(rev);
	if(a==rev)
	{
		System.out.println("given number is palindrome");
	}
	else
	{
		System.out.println("given number is not palindrome");
	}
	
	
}
}