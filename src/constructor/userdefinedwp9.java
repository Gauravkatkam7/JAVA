package constructor;

public class userdefinedwp9 {

	int num1;
	int num2;
	
	userdefinedwp9(int a,int b)
	{
		num1=a;
		num2=b;
		
	}
	
	public void m1() {
		System.out.println(num1+num2);
	}
	public static void main(String []args)
	{
		userdefinedwp9 o1=new userdefinedwp9(22321,33231);
		o1.m1();
	}
}
