package typesofvariables;

public class nonstaticglobal12 {
String s="gaurav";
public static void main(String[] args) {
	nonstaticglobal12 o1=new nonstaticglobal12();
	System.out.println(o1.s);
	
}
public static void name() {
	nonstaticglobal12 o2=new nonstaticglobal12();
	System.out.println(o2.s);
	
}
public void name1() {
	System.out.println(s);
}
}
