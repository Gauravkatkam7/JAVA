package constructor;

public class userdefinedwp10 {

	int num1;
	int num2;
	
	userdefinedwp10(int a,int b)
	
	{
	num1=a;
	num2=b;
	}
	
	public void m1() {
		System.out.println(num1+num2);
	}
	
	public static void main(String[] args) {
		
		userdefinedwp10 o2=new userdefinedwp10(1221,222);
		o2.m1();
	}
}
