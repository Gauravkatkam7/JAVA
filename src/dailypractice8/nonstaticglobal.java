package dailypractice8;

public class nonstaticglobal {

	int i=1;
	
	public static void main(String[] args) {
		
		nonstaticglobal o1=new nonstaticglobal();
		System.out.println(o1.i);
		o1.m1();
		nonstaticglobal1 o2=new nonstaticglobal1();
		System.out.println(o2.a);
	}
	public void m1() {
		
		System.out.println(i);
	}
}
