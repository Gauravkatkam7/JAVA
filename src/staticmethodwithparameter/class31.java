package staticmethodwithparameter;

public class class31 {
public static void main(String[] args) {
	name("amit");
	fullname("amit", "shah");
	studentinfo("amit",32,213.3f,'f');
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
