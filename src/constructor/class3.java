package constructor;

public class class3 {

	
	public static void main(String[] args) {
		
		//default constructor call from same class
		
		class3 o1=new class3();
		o1.name();
		
		//default constructor call from diff class
		
		class4 o2=new class4();
		o2.name();
	}
	
	public void name() {
		System.out.println("running method name");
	}
}
