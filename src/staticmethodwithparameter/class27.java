package staticmethodwithparameter;

public class class27 {
public static void main(String[] args) {
	name("rohan");
	fullname("rohan","perdeshi");
	studentinfo("rohan", 23, 324.3f, 'b');
}

public static void name(String sname) {
	System.out.println(sname);
	
}

public static void fullname(String sname,String slastname) {
	
System.out.println(sname+slastname);
}
public static void studentinfo(String sname,int sno,float sper,char sgrade) {
	System.out.println(sname+" "+sno+" "+sper+" "+sgrade);
}
}
