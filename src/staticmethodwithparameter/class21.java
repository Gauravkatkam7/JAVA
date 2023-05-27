package staticmethodwithparameter;

public class class21 {
public static void main(String[] args) {
	name("gaurav");
	fullname("gaurav", "katkam");
	studentinfo("gaurav", 23, 31.5f, 'b');
}



public static void name(String sname) {
	System.out.println(sname);
}
public static void fullname(String sname,String slastname) {
	System.out.println(sname+" "+slastname);
}
public static void studentinfo(String sname,int sno,float sper,char sgrade)
{
System.out.println(sname+" "+sno+" "+sper+" "+sgrade);	
}
}
