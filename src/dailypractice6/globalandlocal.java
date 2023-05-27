package dailypractice6;

public class globalandlocal {

	int a=122;
	
	
	    public static void name() {
	    	
	    	int c=312;
		
		globalandlocal o1=new globalandlocal();
		System.out.println(o1.a);
		System.out.println(c);
		
	}
	    public void name1() {
			System.out.println(a);
		}
	    public static void main(String[] args) {
			
	    	name();
	    	
	    	globalandlocal o2=new globalandlocal();
	    	System.out.println(o2.a);
	    	
	    	localandglobal2 o3=new localandglobal2();
	    	System.out.println(o3.b);
		}
}
