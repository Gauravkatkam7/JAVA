package typesofvariables;

public class nonstaticglobal3 {
int i=11;

public static void main(String[] args) {
	nonstaticglobal3 o1=new nonstaticglobal3();
	System.out.println(o1.i);
	
}

public static void name() {
	nonstaticglobal3 o2=new nonstaticglobal3();
	System.out.println(o2.i);
}
public void name1() {
	System.out.println(i);
}
}
