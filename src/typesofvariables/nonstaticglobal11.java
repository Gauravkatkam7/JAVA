package typesofvariables;

public class nonstaticglobal11 {
int i=10;

public static void main(String[] args) {
	
	nonstaticglobal11 o2=new nonstaticglobal11();
   System.out.println(o2.i);
   
}
public static void name() {
	nonstaticglobal11 o3=new nonstaticglobal11();
	System.out.println(o3.i);
	
}
public void name1() {
	System.out.println(i);
}
}
