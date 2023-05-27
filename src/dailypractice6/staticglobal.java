package dailypractice6;

public class staticglobal {
	static int a=123;
	
	public static void main(String[] args) {
		
		System.out.println(a);
		name();
		
		staticglobal o1=new staticglobal();
		System.out.println(o1.a);
		
		o1.name2();
		
		staticglobal3 o2=new staticglobal3();
		System.out.println(o2.y);
		
	}
	
	public static void name() {
		
		System.out.println(a);
		
	}
	public void name2() {
		int b=68;
		System.out.println(a);
	System.out.println(b);
	}
	
	

}
