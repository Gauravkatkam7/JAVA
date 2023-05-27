package accessspecifier;

public class public7 {

	public int a;
	
	public public7()
	{
		a=23;
		
	}
	
	public void m1()
	{
		System.out.println(a+a+a+a);
		
	}
	
	public static void main(String[] args) {
		public7 p7=new public7();
		System.out.println(p7.a);
		p7.m1();
	}
}
