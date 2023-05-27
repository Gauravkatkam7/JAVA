package staticmethodwithparameter;

public class class25 {
public static void main(String[] args) {
	name("harish");
	fullname("harish", "adep");
	studentinfo("harish", 877, 6776.8f, 'a');
	
}

public static void name(String sname)
{
System.out.println(sname);

}
public static void fullname(String sname,String slastname) {
	System.out.println(sname+slastname);
	
}

public static void studentinfo(String sname,int sno,float sper,char sgrade) {
	System.out.println(sname+" "+sno+" "+sper+" "+sgrade);
}
}
