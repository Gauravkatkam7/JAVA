package constructor;

public class userdefinedwp7 {

	int num1;
	int num2;
	
	userdefinedwp7(int a,int b)
	
	{
		 num1=a;
		 num2=b;
		
	}
	
	public void m4()
	{
		System.out.println(num1*num2);
		
	}
	public static void main(String[]args)
	{
		userdefinedwp7 o2=new userdefinedwp7(233,331);
		o2.m4();
	}
}
