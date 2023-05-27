package constructor;

public class userdefinedwparameter1 {

	int num1;
	int num2;
	
	userdefinedwparameter1(int a,int b)
	{
		num1=a;
		num2=b;
		
	}
	
	public  void m1()
	{
		System.out.println(num1*num2);
		
	}
	public static void main(String[] args) {
		
		userdefinedwparameter1 o1=new userdefinedwparameter1(123,242);
		o1.m1();
	}
}
