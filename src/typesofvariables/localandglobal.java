package typesofvariables;

public class localandglobal {

	
	int b=10;
	
	//global variable(outside method)
	
	public void m1() 
	
	{
		int a=20;            //local variable(inside method)
		
		System.out.println(b);
        System.out.println(a);
	}
	public static void main(String[] args) {
		
		localandglobal o1=new localandglobal();
		o1.m1();
	}
		
	
}
