package accessspecifier;

public class protected1 {

	protected int i;
	
	protected protected1 ()
	{
		i=32;
		
	}
	
      protected void cubeofi()
	{
		System.out.println(i*i*i);
	}
      
      public static void main(String[] args) {
		
    	  protected1 p1=new protected1();
    	  System.out.println(p1.i);
    	  p1.cubeofi();
	}
}
