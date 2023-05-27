package dailypractice1;

public class staticmethodwithparameter1 {
public static void main(String[] args) {
	
	name("gaurav");
	fullname("gaurav", "katkam");
	studentinfo("gaurav",3312,32.4f,'z');
	
}
public static void name(String sname) 
{
System.out.println(sname);

}
public static void fullname(String name,String lastname)
{
	System.out.println(name+lastname);
	
}
public static void studentinfo(String sname,int sno,float sper,char sgrade) {
	
	System.out.println(sname+" "+sno+" "+sper+" "+sgrade);
	
}
}
