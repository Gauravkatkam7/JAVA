package constructor;

public class multiplecons6 {

	int num1;
	int num2;
	
	multiplecons6()
	{
		num1=32;
		num2=45;
	}
	
	multiplecons6(int a,int b)
	{
		num1=a;
		num2=b;
		
	}
	
	public void m1()
	{
		System.out.println(num1-num2);
		
	}
	
	public static void main(String[]args)
	{
		multiplecons6 o1=new multiplecons6();
		o1.m1();
		
		multiplecons6 o2=new multiplecons6(12134,33);
		o2.m1();
	}
}
