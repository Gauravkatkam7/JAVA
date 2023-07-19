package assignments;

public class armstrongNumber1 {

	public static void main(String[] args) {
		
	
	int a=153;
	int arm=0;//27
	                 //1
	for(int i=a;i>0;i=i/10)
	{
		int rem=i%10;//1
		arm=arm+rem*rem*rem;//36
	}
	if(a==arm)
	{
		System.out.println("given number is armstrong number");
	}
	else
	{
		System.out.println("given number is not armstrong number");
	}
}
}