package dailypractice6;

public class nonstaticmcfsc {
public static void main(String[] args) {
	nonstaticmcfsc o1=new nonstaticmcfsc();
	o1.name();
	nonstaticmcfdc o8=new nonstaticmcfdc();
	o8.m1();
	o1.multiplication(3123, 2123);
	o8.studentinfo("gaurav", 2231,31.3f,'s');
	
}
public void name() {
	System.out.println("hello");
}
public void multiplication(int num1,int num2) {
	System.out.println(num1*num2);
}
}
