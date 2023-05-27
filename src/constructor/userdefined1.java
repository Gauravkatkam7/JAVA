package constructor;

public class userdefined1 {

	int a;
	int b;
	
	//userdefined constructor
	//use1=intialize the global veriable
	//use2=copy members of class into object
	
	userdefined1()
	{
		 a=12;
		 b=33;
	}
	
	public void addition()
	{
		System.out.println(a+b);
		
	}
	public void multiplication()
	{
		System.out.println(a*b);
	}
	
	public static void main(String [] args)
	{
		//user defined constructor call from same class
		userdefined1 o1=new userdefined1();
		o1.addition();
		o1.multiplication();
		//user defined constructor call from diff class
		userdefined2 o2=new userdefined2();
		o2.subtraction();
		
		
	}
	
	
}
