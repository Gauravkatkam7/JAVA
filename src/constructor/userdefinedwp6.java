package constructor;

public class userdefinedwp6 {

	int num1;
	int num2;
	
	userdefinedwp6(int a,int b)
	{
		num1=a;
		num2=b;
	}
	
	public void m3()
	{
		System.out.println(num1+num2);
	}
	
	public static void main(String[] args) {
		
		userdefinedwp6 o1=new userdefinedwp6(132,1313);
	               o1.m3();
	}           
	
}
