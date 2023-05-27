package assignments;


public class armstrongnumber {
public static void main(String[] args) {
	

	int a=371;
	int arm=0;
	
	for(int i=a;i>0;i=i/10)
	{
		int rem=i%10;
		arm=arm+rem*rem*rem;//1+343=344+27=371
	}
	if(a==arm)
	{
		System.out.println("given num is armstrong");
	}
	else
	{
		System.out.println("given num is not armstrong");
	}
}
}