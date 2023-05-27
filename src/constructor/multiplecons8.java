package constructor;

public class multiplecons8 {

	float num1;
	float num2;
	
	multiplecons8()
	{
		num1=313.3f;
		num2=323.1f;
		
	}
	
	multiplecons8(float a,float b)
	{
	   num1=a;
	   num2=b;
	}
	
	public void m1() {
		System.out.println(num1+num2);
	}
	
	public static void main(String[] args) {
		
		multiplecons8 o1=new multiplecons8();
		o1.m1();
		multiplecons8 o2=new multiplecons8();
		o2.m1();
	}
}
