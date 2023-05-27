package constructor;

public class userdefined17 {

	
	int aa;
	int bb;
	
	userdefined17()
	{
		aa=432;
		bb=233;
		
	}
	
	public void multo() {
		System.out.println(aa*bb);
		
		
	}
	public static void main(String[] args) {
		
		userdefined17 o1=new userdefined17();
		o1.multo();
		
		userdefined18 o2=new userdefined18();
		o2.m2();
	}
}
