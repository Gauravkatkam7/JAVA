package constructor;

public class multiplecons7 {

	int num1;
	int num2;
	
	multiplecons7()
	{
		num1=3223;
		num2=311;
		
	}
	
	multiplecons7(int a,int b)
	{
		num1=a;
		num2=b;
	}
	
	public void division() {
		System.out.println(num1/num2);
	}
	public static void main(String[] args) {
		multiplecons7 o1=new multiplecons7();
		o1.division();
		
		multiplecons7 o2=new multiplecons7(3223,6);
		o2.division();
	}
}
