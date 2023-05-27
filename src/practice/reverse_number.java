package practice;

public class reverse_number {

	public static void main(String[] args) {
		
		
		int a=1234;
		int rev=0;//4321
		for(int i=a;i>0;i=i/10)
		{
			int rem=i%10;
			rev=rev*10+rem;
		}
		System.out.println(rev);
	}
}
