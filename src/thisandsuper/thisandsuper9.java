package thisandsuper;

public class thisandsuper9 extends thisandsuper10 {

	int e=223;
	
	public void m6() {
		int e=2121;
		System.out.println(e);
		System.out.println(this.e);
		System.out.println(super.e);
	}
	public static void main(String[] args) {
		thisandsuper9 o1=new thisandsuper9();
		o1.m6();
		
	}
}
