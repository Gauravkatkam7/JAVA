package staticmethodwithparameter;

public class class28 {
public static void main(String[] args) {
	
	name("bolt");
	fullname("hussain", "bolt");
	studentinfo("hussain", 17, 17.5f, 'a');
}

public static void name(String sname) {
	
}

public static void fullname(String sname,String lastname) {
	System.out.println(sname+lastname);
}

public static void studentinfo(String sname,int sno,float sper,char sgrade) {
	System.out.println(sname+" "+sno+"  "+sper+" "+sgrade);
}
}
