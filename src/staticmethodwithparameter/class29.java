package staticmethodwithparameter;

public class class29 {
public static void main(String[] args) {
	name("mum");
	fullname("mum", "dad");
	studentinfo("mum", 342, 23.2f, 'd');
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
