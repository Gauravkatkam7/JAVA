package constructor;

public class multiplecons {

	int num1;
	int num2;
	
	// constructor overloading
	multiplecons()
	{
		num1=212;
		num2=211;
	}
	
	multiplecons(int a,int b)
	{
		num1=a;
		num2=b;
		
	}
	
	public void add() {
		
		System.out.println(num1+num2);
		
	}
	public static void main(String[] args) {
		//constructor with zero parameter call from same class
		multiplecons o1=new multiplecons();
		o1.add();
		// constructor with parameter call from same class
		multiplecons o2=new multiplecons(331, 3232);
		o2.add();
		//constructor with zero parameter call from diff class
		multiplecons2 o3=new multiplecons2();
		o3.mul();
		// constructor with parameter call from diff class
		multiplecons2 o4=new multiplecons2(323,133);
		o4.mul();
				
	}
	
}
