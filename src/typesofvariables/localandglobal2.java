package typesofvariables;

public class localandglobal2 {

	int b=20;
	
	public  void m2() {
		int a=10;
		System.out.println(b);
		System.out.println(a);
	}
	public static void main(String[] args) {
		localandglobal2 o2=new localandglobal2();
		o2.m2();
		
	}
}
