package accessspecifier;

public class protected3 {

	protected int a;
	
  protected protected3()
  {
	  a=32;
	  
  }
  
  protected void squareofnum()
  {
	  System.out.println(a*a);
	  
  }
  
  public static void main(String[] args) {
	
	  protected3 p3=new protected3();
	  System.out.println(p3.a);
	  p3.squareofnum();
}
	
}
