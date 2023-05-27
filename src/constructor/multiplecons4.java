package constructor;

public class multiplecons4 {

	int num1;
	int num2;
	String name;
	
	multiplecons4()
	{
		num1=3231;
		num2=3131;
		
	}
	
	multiplecons4(int a,int b)
	{
		num1=a;
		num1=b;
		
	}
	multiplecons4(String s1)
	{
		name=s1;
		
	}
	
	public void add() {
		System.out.println(num1+num2);
	}
	public void name() {
		System.out.println(name);
		
	}
	public static void main(String[] args) {
		
		multiplecons4 o1=new multiplecons4();
		o1.add();
		multiplecons4 o2=new multiplecons4(212,313);
		o2.add();
		multiplecons4 o3=new multiplecons4("gaurav");
		o3.name();
				
	}


}
