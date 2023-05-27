package thisandsuper;

public class thisandsuper5 extends thisandsuper6 {

	int c=242;
    
	public void m3() {
		int c=123;
		System.out.println(c);
		System.out.println(this.c);
		System.out.println(super.c);
		
	}
	public static void main(String[] args) {
		
		thisandsuper5 o1=new thisandsuper5();
		o1.m3();
		
	}
}
