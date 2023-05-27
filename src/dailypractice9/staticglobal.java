package dailypractice9;

public class staticglobal {

	static int i=10; 
	
	public static void main(String[] args) {
		
		System.out.println(i);
		
		staticglobal o1=new staticglobal();
		System.out.println(o1.i);
		
		staticglobal1 o2=new staticglobal1();
		System.out.println(o2.b);
	}
	public void m1() {
		System.out.println(i);
	}
}
