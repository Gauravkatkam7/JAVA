package constructor;

public class userdefined12 {

	int num1;
	int num2;
	
	userdefined12()
	{
		num1=32;
		num2=232;
		
	}
	
	public void divide()
	{
		System.out.println(num2/num1);
		
	}
	
	public static void main(String[] args) {
		
		userdefined12 o1=new userdefined12();
		
		          o1.divide();
		          
		          userdefined13 o2=new userdefined13();
		          o2.m1();
	}
}
