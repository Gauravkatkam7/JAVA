package dailypractice6;

public class nonstaticglobal {

	int i=114;
	
	public static void main(String[] args) {
		
		
		nonstaticglobal o2=new nonstaticglobal();
		System.out.println(o2.i);
		
		nonstaticglobal2 o3=new nonstaticglobal2();
		System.out.println(o3.m);
	}
	
	public static void name() {
		nonstaticglobal o1=new nonstaticglobal();
		System.out.println(o1.i);
		
	}
	public void name1() {
		System.out.println(i);
	}
}
