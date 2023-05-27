package thisandsuper;

public class thisandsuper7 extends thisandsuper8 {

	int d=11;
	
	public void m5() {
		int d=12;
		System.out.println(d);System.out.println(this.d);System.out.println(super.d);
	}
	
	public static void main(String[] args) {
		thisandsuper7 o1=new thisandsuper7();
		o1.m5();
	}
}
