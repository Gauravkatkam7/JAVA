package constructor;

public class userdefined15 {

	int cc;
	int dd;
	
	userdefined15()
	{
		cc=322;
		dd=2233;
		
	}
	
	public void divivde() {
		System.out.println(dd/cc);
		
	}
	
	public static void main(String[] args) {
		
		userdefined15 o1=new userdefined15();
		o1.divivde();
		
		userdefined16 o2=new userdefined16();
            o2.m1();	
	}
}
