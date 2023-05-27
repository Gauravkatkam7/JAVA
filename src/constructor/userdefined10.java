package constructor;

public class userdefined10 {

	int b;
	
	int c;
	
	userdefined10()
	{
		b=321;
		c=456;
		
	}
	
	public void multiplication() {
		System.out.println(b*c);
	}
	
	public static void main(String[] args) {
		
		userdefined10 o1=new userdefined10();
		o1.multiplication();
		
		userdefined11 o2=new userdefined11();
		o2.multi();
	}
}
