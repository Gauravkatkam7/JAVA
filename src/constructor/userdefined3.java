package constructor;

public class userdefined3 {

	int a;
	int b;
	
	userdefined3()
	{
		
		a=23;
		b=232;
		
	}
	
	public void m2()
	{
		System.out.println(a-b);
		
		
	}
	public void multiplication()
	{
		System.out.println(a*b);
		
	}
	
	public static void main(String[] args) {
		
		userdefined3 o2=new userdefined3();
		o2.m2();
		o2.multiplication();
		
		userdefine4 o3=new userdefine4();
		o3.m2();
	}
}
