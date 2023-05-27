package casting;

public class nonprimitive_upcasting3 {

	public static void main(String[] args) {
		// create object of subclass with reference of superclass
		// superclass reference                 subclass
		nonprimitive_upcasting1 n1=new nonprimitive_upcasting2();
		n1.home();
		n1.money();
		n1.car();
		
	}
}
