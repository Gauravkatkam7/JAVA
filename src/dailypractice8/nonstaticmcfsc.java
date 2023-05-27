package dailypractice8;

public class nonstaticmcfsc {

	
	public static void main(String[] args) {
		nonstaticmcfsc o1=new nonstaticmcfsc();
		o1.m1();
		nonstaticmcfdc o2=new nonstaticmcfdc();
		o2.m2();
		
		o1.fullname("gaurav", "katkam");
		o2.stduentinfo("gaurav", 322, 232.2f, 'a');
	}
	
	public void m1() {
		
		System.out.println("running nonstatic method m1");
	}
	
	public void fullname(String name,String lastname) {
		System.out.println(name+lastname);
	}
}
