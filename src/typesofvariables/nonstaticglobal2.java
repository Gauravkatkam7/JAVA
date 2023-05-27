package typesofvariables;

public class nonstaticglobal2 {
int i=10;

public static void main(String[] args) {
	nonstaticglobal2 o1=new nonstaticglobal2();

	System.out.println(o1.i);
}

public static void name() {
	nonstaticglobal2 o2=new nonstaticglobal2();
	System.out.println(o2.i);
}
}
