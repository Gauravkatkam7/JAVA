package constructor;

public class userdefined7 {

	int a;
	int b;
	
	userdefined7()
	{
		a=322;
		b=342;
	}
	
	public void addition() {
		System.out.println(a+b);
	}
	public void subtraction() {
		
		System.out.println(b-a);
	}
	public static void main(String[] args) {
		
		userdefined7 o1=new userdefined7();
		o1.addition();
		o1.subtraction();
		
		userdefined8 o2=new userdefined8();
		o2.subtraction();
	}
}
