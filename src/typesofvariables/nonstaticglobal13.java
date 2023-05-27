package typesofvariables;

public class nonstaticglobal13 {
int i=11;

public static void main(String[] args) {
	nonstaticglobal13 o1=new nonstaticglobal13();
	System.out.println(o1.i);
}
public static void name() {
	nonstaticglobal13 o2=new nonstaticglobal13();
	System.out.println(o2.i);
}
public void m1() {
	System.out.println(i);
}
}
