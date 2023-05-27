package dailypractice6;

public class staticgloabal {
   static int i=100;
   public static void main(String[] args) {
	
	   System.out.println(i);
	

	  //staticglobal call from diff class
	staticglobal2 o2=new staticglobal2();
	System.out.println(o2.c);
	
	
	
	
}
   
   public static void m1() {
	System.out.println(i);
}
   public void m2() {
	System.out.println(i);
}
}
