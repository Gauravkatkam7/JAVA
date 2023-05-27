package staticmethodwithparameter;

public class class24 {
public static void main(String[] args) {
	name("mohan");
	fullname("mohan", "raje");
	studentinfo("soham", 23, 12.5f, 'a');
}

public static void name(String sname) {
	System.out.println(sname);
	
	
}

public static void fullname(String sname,String lastname) {
	System.out.println(sname+lastname);
}

public static void studentinfo(String sname,int sno,float sper,char sgrade) {
	System.out.println(sname+" "+sno+" "+sper+" "+sgrade);
}
}
