package constructor;

public class userdefinedcons {

	
	int a;
	int b;
	
	userdefinedcons()
	{
		
		a=545;
		b=657;
		
	}
	
	public void add() {
		System.out.println(a+b);
		
	}
	public void sub() {
		System.out.println(a-b);
	}
	
	public static void main(String[] args) {
		
		userdefinedcons o1=new userdefinedcons();
		o1.add();
		o1.sub();
	}
}
