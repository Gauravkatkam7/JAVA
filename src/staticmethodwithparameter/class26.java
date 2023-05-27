package staticmethodwithparameter;

public class class26 {
public static void main(String[] args) {
	name("kalpesh");
	fullname("kalpesh","kokul");
	studentinfo("kalpesh", 233, 2213.4f, 'd');
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
