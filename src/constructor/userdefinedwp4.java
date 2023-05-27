package constructor;

public class userdefinedwp4 {

	int num1;
	int num2;
	
	userdefinedwp4(int a,int b)
	{
		num1=a;
		num2=b;
	}
	
	public void m2()
	{
		System.out.println(num1-num2);
		
		
	}
	
	public static void main(String[] args) {
		
		userdefinedwp4 o1=new userdefinedwp4(1312,213);
				o1.m2();
	}
	
	
}
