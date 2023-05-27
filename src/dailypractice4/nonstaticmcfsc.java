package dailypractice4;

public class nonstaticmcfsc {
public static void main(String[] args) {
	nonstaticmcfsc o1=new nonstaticmcfsc();
	o1.s1();
	nonstaticmcfdc o2=new nonstaticmcfdc();
	o2.s2();
	o1.studentper(23.2f);
	o2.studentinfo("gaurav", 11, 11.11f, 'a');
}


public void s1() {
	System.out.println("hiiiii");
}
public void studentper(float per) {
	System.out.println(per);
}
}
