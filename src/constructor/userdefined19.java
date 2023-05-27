package constructor;

public class userdefined19 {

	
	String name;
	int no;
	
	userdefined19()
	{
		
		name="gaurav";
		no=323;
		
	}
	
	public void name() {
		
		System.out.println(name+no);
		
	}
	
	public static void main(String[] args) {
		
		userdefined19 o1=new userdefined19();
		o1.name();
		
		userdefined20 o2=new userdefined20();
		o2.m2();
	}
}
