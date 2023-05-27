package dailypractice9;

public class nonstaticglobal {

	int i=21;
	
	public static void main(String[] args) {
		
		nonstaticglobal o1=new nonstaticglobal();
		System.out.println(o1.i);
	
		System.out.println(o1.i);
		
		nonstaticglobal1 o2=new nonstaticglobal1();
		System.out.println(o2.c);
	}
	public void name() {
		System.out.println(i);
	}
	
}
