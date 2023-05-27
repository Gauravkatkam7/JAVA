package dailypractice7;

public class nonstaticglobal1 {

	int c=232;
	public static void main(String[] args) 
	{
	
		nonstaticglobal1 o2=new nonstaticglobal1();
		System.out.println(o2.c);
		
		o2.m4();
		
		nonstaticglobal2 o4=new nonstaticglobal2();
		System.out.println(o4.j);
		
	}
	public void m4()
	{
		System.out.println(c);
	}
}
