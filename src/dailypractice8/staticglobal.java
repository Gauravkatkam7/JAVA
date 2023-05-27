package dailypractice8;

public class staticglobal {

	static int i=100;
	
	public static void main(String[] args) {
		//staticglobal call from same class
		System.out.println(i);
		
		staticglobal o1=new staticglobal();
		o1.m1();
		
		staticglobal1 o2=new staticglobal1();
		System.out.println(o2.b);
		
	}
	
	public void m1() {
		
		System.out.println(i);
		staticglobal1 o3=new staticglobal1();
		System.out.println(o3.b);
	}
}
