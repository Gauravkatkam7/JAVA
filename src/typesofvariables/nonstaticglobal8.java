package typesofvariables;

public class nonstaticglobal8 {
int b=213;

public static void main(String[] args) {
	nonstaticglobal8 o2=new nonstaticglobal8();
System.out.println(o2.b);

}
public static void name() {
	nonstaticglobal8 o3=new nonstaticglobal8();
System.out.println(o3.b);

}
public void m1() {
	System.out.println(b);
}
}
