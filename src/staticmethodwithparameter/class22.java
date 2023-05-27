package staticmethodwithparameter;

public class class22 {
public static void main(String[] args) {
	name("saurab");
	fullname("saurab", "lakale");
	studentinfo("saurabh", 23, 32.3f, 'd');
}

public static void name(String mname)
{
System.out.println(mname);	
}
public static void fullname(String name,String lastname) {
	System.out.println(name+lastname);
}

public static void studentinfo(String mname,int mno,float mper,char mgrade) {
	System.out.println(mname+" "+mno+" "+mper+" "+mgrade);
	
}
}
