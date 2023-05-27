package accessspecifier;

public class public1 {

	public int a;
	
	public public1()
	{
		a=3213;
		
	}
	 
	 public void sub() {
		 System.out.println(a-a);
	 }
	 
	 public static void main(String[] args) {
		
		 public1 p1=new public1();
		 System.out.println(p1.a);
		 p1.sub();
	}
}
