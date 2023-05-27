package typesofvariables;

public class nonstaticglobal9 {
int b=111;

public static void main(String[] args) {
	
	nonstaticglobal9 o2=new nonstaticglobal9();
  System.out.println(o2.b);
  
}
public static void name() {
	nonstaticglobal9 o3=new nonstaticglobal9();
System.out.println(o3.b);

}
public void name1() {
	System.out.println(b);
}
}
