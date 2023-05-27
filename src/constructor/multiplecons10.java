package constructor;

public class multiplecons10 {

	int num1;
	int num2;
	
	multiplecons10()
	{
		num1=32;
		num2=45;
		
	}
	
	multiplecons10(int a,int b)
	{
		num1=a;
		num2=b;
		
	}
	
	public void m1() {
		System.out.println(num1*num2);
	}
	public static void main(String[] args) {
		
		multiplecons10 o1=new multiplecons10();
		o1.m1();
		
		multiplecons10 o2=new multiplecons10(221,331);
		o2.m1();
	}
}
