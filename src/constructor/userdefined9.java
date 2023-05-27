package constructor;

public class userdefined9 {

	int a;
	int b;
	
	userdefined9()
	{
		a=3223;
		b=323;
		
	}
	
	public void addition() {
		
		System.out.println(a+b);
		
	}
	
	public void subtraction() {
		System.out.println(a-b);
		
	}
	
	public static void main(String[] args) {
		
		userdefined9 o2=new userdefined9();
		o2.addition();
		o2.subtraction();
		
		userdefined10 o3=new userdefined10();
		o3.multiplication();
	}
}
