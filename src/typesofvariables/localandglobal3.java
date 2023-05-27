package typesofvariables;

public class localandglobal3 {

	int a=30;             //global variable(outside method)
	public static void main(String[] args) {
		
		localandglobal3 o3=new localandglobal3();
		o3.m2();
	}
	public void m2() {
		int b=10;                  //local variable(inside method)
		System.out.println(a);
	}
	
	
}
