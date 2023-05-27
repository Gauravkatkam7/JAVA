package constructor;

public class defaultconstructor1 {
	
	//default constructor provided by compiler
	//use: to copy/load all the members of class into object
	
	//defaultconstructor1()
    //{
		
    //}
	
	public static void main(String[] args) {
		
		
		defaultconstructor1 o1=new defaultconstructor1();
		//default constructor call from same class
		o1.m1();
		
		System.out.println("--------------------");
		
		// default constructor call from diff class
		defaultconstructor2 o2=new defaultconstructor2();
		o2.m2();
		
	}
	
	public void m1() {
		System.out.println("running method m1");
	}

}
