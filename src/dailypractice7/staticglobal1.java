package dailypractice7;

public class staticglobal1{

	static int i=2112;
	
	public static void main(String[] args) 
	{
	
		System.out.println(i);
		
		System.out.println(staticglobal2.a);
		
		staticglobal1 o1=new staticglobal1();
		o1.m1();
		
		
		
	}
	
	public void m1()
	{
		System.out.println(i);
	}
	
}
