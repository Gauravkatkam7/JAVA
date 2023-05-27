package constructor;

public class userdefinedwp8 {

	int num1;
	int num2;
	
	userdefinedwp8(int a,int b)
	{
		num1=a;
		num2=b;
	}
	
	public void m1() {
		System.out.println(num1+num2);
		
	}
	public static void main(String[] args) {
		
		userdefinedwp8 o1=new userdefinedwp8(111,3332);
		o1.m1();
		
	}
}
