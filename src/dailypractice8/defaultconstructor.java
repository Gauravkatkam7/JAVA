package dailypractice8;

public class defaultconstructor {

	public static void main(String[] args) {
		
		//default constructor call from same class
		defaultconstructor o1=new defaultconstructor();
		o1.m1();
		o1.m1();
		o1.m1();
		 System.out.println("------------------");
		 
		 defaultconstructor1 o2=new defaultconstructor1();
		 o2.m2();
		 o2.m2();
		 o2.m2();
	}
	
	public void m1() {
		System.out.println("gm");
	}
}
