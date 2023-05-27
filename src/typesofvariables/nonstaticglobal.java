package typesofvariables;

public class nonstaticglobal {
int a=10;

public static void main(String[] args) {
	nonstaticglobal o1=new nonstaticglobal();
	System.out.println(o1.a);
	
}

public static void name() {
	nonstaticglobal o2=new nonstaticglobal();
	System.out.println(o2.a);
}
public void m1() {
	System.out.println(a);
}
}
