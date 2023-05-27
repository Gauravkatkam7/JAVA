package typesofvariables;

public class staticglobal {

	static int a=1;
	
	public static void main(String[] args) {
		System.out.println(a);
	    m1();
	    staticglobal o1=new staticglobal();
	    o1.m2();
	    System.out.println(staticglobal1.a);
	}
	
	public static void m1() {
		System.out.println(a);
		
	}
	public void m2() {
		System.out.println(a);
	}
}
