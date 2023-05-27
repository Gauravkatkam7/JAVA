package typesofvariables;

public class localandglobal11 {

	static int a=10;
	public static void main(String[] args) {
		m2();
		System.out.println(a);
	}

	
	public static void m2() {
		System.out.println(a);
	}
}
