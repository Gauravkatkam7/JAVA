package constructor;

public class userdefined13 {

	int aa;
	int bb;
	
	userdefined13()
	{
		aa=231;
		bb=322;
		
	}
	
	public void m1() {
		System.out.println(aa*bb);
	
	}
	public static void main(String[] args) {
		
		userdefined13 o1=new userdefined13();
		o1.m1();
		
		userdefined14 o2=new userdefined14();
		o2.multi();
	}
	

}
