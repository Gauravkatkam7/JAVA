package constructor;

public class userdefinedwparameter {

	int num1;
	int num2;
	
	userdefinedwparameter(int a,int b)
	{
		num1=a;
		num2=b;
		
		
	}
	
	public void add()
	{
		System.out.println(num1+num2);
		
	}
	public void sub()
	{
		System.out.println(num1-num2);
		
	}
	
	public static void main(String[] args) {
		
		userdefinedwparameter o1=new userdefinedwparameter(123,23);
		o1.add();
		
		o1.sub();
		
		userdefinedwparameter o2=new userdefinedwparameter(1234,4);
		o2.add();
		o2.sub();
	}
}
