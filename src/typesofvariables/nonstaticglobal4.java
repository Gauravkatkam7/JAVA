package typesofvariables;

public class nonstaticglobal4 {
int a=12;

public static void main(String[] args) {
	nonstaticglobal4 o2=new nonstaticglobal4();
	System.out.println(o2.a);


}
public static void name() {
	nonstaticglobal4 o3=new nonstaticglobal4();
	System.out.println(o3.a);
	
}
public void name1() {
	System.out.println(a);
}
}
