package dailypractice7;

public class nonstaticmcfsc {
public static void main(String[] args) {
	nonstaticmcfsc o2=new nonstaticmcfsc();
	o2.m1();
	nonstaticmcfdc o3=new nonstaticmcfdc();
	o3.m2();
	
	o2.subtraction(3424221, 234);
	o3.studentinfo("gaurav", 32, 112.2f, 'a');


}

public void m1()
{
	System.out.println("calling nonstatic method from same class");
}

public void subtraction(int num1,int num2)
{
	System.out.println(num1-num2);
}
}
