package typesofvariables;

public class nonstaticglobal5 {
int b=20;

public static void main(String[] args) {
	nonstaticglobal5 o1=new nonstaticglobal5();
	System.out.println(o1.b);
	
}
public static void m1() {
	nonstaticglobal5 o2=new nonstaticglobal5();
	System.out.println(o2.b);
	
}
public void name() {
	System.out.println(b);
}
}
