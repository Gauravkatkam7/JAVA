package staticmethodwithparameter;

public class class23 {
public static void main(String[] args) {
	name("saipan");
 fullname("gaurav", "katkam");
 studentinfo("gaurav", 233, 323.2f, 'c');
 
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
