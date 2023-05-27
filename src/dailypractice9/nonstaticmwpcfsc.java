package dailypractice9;

public class nonstaticmwpcfsc {

	public static void main(String[] args) {
		nonstaticmwpcfsc o1=new nonstaticmwpcfsc();
		o1.m1(123,2);
		
		nonstaticmwpcfdc o2=new nonstaticmwpcfdc();
		o2.m2(2121,23);
		
	}
	
	public void m1(int num1,int num2) {
		System.out.println(num1-num2);
	}
}
