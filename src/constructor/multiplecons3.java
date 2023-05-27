package constructor;


public class multiplecons3 {

	
	int a;
	int b;
	String name1;
	
	multiplecons3()
	{
		a=3223;b=331;
	}
	
	multiplecons3(int c,int d)
	
	{
		 a=c;
		 b=d;
		
	}
	multiplecons3(String s1)
	{
	 name1=s1;
	}
	public void m1() {
		System.out.println(a*b);
		
	
	}
	public void name1() {
		System.out.println(name1);
	}
	
	
	public static void main(String[] args) {
		
		multiplecons3 o1=new multiplecons3();
		o1.m1();
	    multiplecons3 o2=new multiplecons3(321,242);
	    o2.m1();
	    multiplecons3 o3=new multiplecons3("gaurav");
	    o3.name1();
	}
}
