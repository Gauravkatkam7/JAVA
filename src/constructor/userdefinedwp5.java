package constructor;

public class userdefinedwp5 {

	int num1;
	int num2;
	
	public userdefinedwp5(int a,int b) 
		{num1=a;
		num2=b;
		}
	
	public void m2()
	{
		System.out.println(num1+num2);
		
	}
	
	public static void main(String[] args) {
		
		userdefinedwp5 o1=new userdefinedwp5(123,33333);
		          o1.m2();
	}
}
		
          
	
