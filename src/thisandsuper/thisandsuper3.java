package thisandsuper;

public class thisandsuper3 extends thisandsuper4{

	int b=11;
	
	public void m2() {
		int b=22;
		System.out.println(b);
		System.out.println(this.b);
		System.out.println(super.b);
	}
	public static void main(String[] args) {
		thisandsuper3 o1=new thisandsuper3();
		o1.m2();
	}
}
