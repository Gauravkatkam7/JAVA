package constructor;

public class userdefined5 {

	int a;
	int c;
	
	userdefined5()
	{
		a=32;
		c=3223;
		
		
	}
	
	public void subtraction() {
		
		System.out.println(c-a);
	}
	public void addition() {
		System.out.println(a+c);
		
	}
	public static void main(String[] args) {
		
		userdefined5 o1=new userdefined5();
                 o1.subtraction();
                 o1.addition();
                 
                 userdefined6 o2=new userdefined6();
                 o2.multi();
	}
}
