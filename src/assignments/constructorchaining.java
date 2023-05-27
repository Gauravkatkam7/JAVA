package assignments;

public class constructorchaining {

	int num1;
	int num2;
	int num3;
	
	constructorchaining()
	{
		num1=32;
		num2=54;
		System.out.println(num1+num2);
	}
	
	constructorchaining(int a,int b)
	{
		this();
		num1=a;
		num2=b;
		
		System.out.println(a+b);
	}
	constructorchaining(int a,int b,int c)
	{
		this(34,54);
		num1=a;
		num2=b;
		num3=c;
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		constructorchaining c1=new constructorchaining(23,43,23);
		
		
	}
}
