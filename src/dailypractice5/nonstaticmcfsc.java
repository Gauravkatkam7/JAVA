package dailypractice5;

public class nonstaticmcfsc {
public static void main(String[] args) {
	nonstaticmcfsc o1=new nonstaticmcfsc();
          o1.m1();
          o1.fullname("gaurav", "katkam");
          nonstaticmcfdc o2=new nonstaticmcfdc();
          o2.s1();
          o2.studentinfo("rohit", 12, 21.2f, 's');
}

public void m1() {
	System.out.println("hiii");
}

public void fullname(String name,String lastname) {
	System.out.println(name+lastname);
}
}
