package inheritance;

public class hirarchicle4 {

	public static void main(String[] args) {
		
		hirarchicle1 o1=new hirarchicle1();
		System.out.println("hirarchicle1"+"\n"+"-------------");
		o1.car();
		o1.home();
		o1.money();
		o1.bike();
		
		System.out.println("\n"+"hirarchicle2"+"\n"+"--------------");
		hirarchicle2 o2=new hirarchicle2();
		o2.car();
		o2.home();
		o2.money();
	    o2.cycle();
		
	    System.out.println("\n"+"hirarchicle3"+"\n"+"--------------");
	    hirarchicle3 o3=new hirarchicle3();
	    o3.car();
	    o3.clothes();
	    o3.home();
	    o3.money();
	}
}
