package thisandsuper;

public class thisandsuper1 extends thisandsuper2 {
   //a=22  (superclass)
	int a=12;
	
	public void m1() {
		int a=43;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
	public static void main(String[] args) {
		thisandsuper1 o1=new thisandsuper1();
		o1.m1();
	}
}