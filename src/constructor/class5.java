package constructor;

public class class5 {

	public static void main(String[] args) {
		
		//default constructor call from same class
		class5 o1=new class5();
		o1.m1();
		
		// default constructor call from diff class
		class6 o2=new class6();
		o2.m2();
	}
	
	public void m1() {
		System.out.println("running m1 method");
	}
}
