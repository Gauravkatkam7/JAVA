package polymorphism;

public class methodoverriding2 {

	public static void main(String[] args) {
		
		methodoverriding m1=new methodoverriding();
		m1.car();
		m1.home();
		m1.money();
		
		methodoverriding1 m2=new methodoverriding1();
		m2.car();
		m2.home();
		m2.money();
	}
}
