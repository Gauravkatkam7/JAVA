package staticmethodwithparameter;

public class class30 {
public static void main(String[] args) {
	name("saurabh");
	lastname("tirthraj", "ghadge");
	studentinfo("rohit", 23312, 232.2f, 'a');
}

public static void name(String sname) {
	
	System.out.println(sname);
	
}
public static void lastname(String sname,String slastname) {
	System.out.println(sname+slastname);
	
}
public static void studentinfo(String sname,int sno,float sper,char sgrade) {
	System.out.println(sname+" "+sno+" "+sper+" "+sgrade);
}
}
