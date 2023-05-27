package constructor;

public class multiplecons2 {

	int num3;
	int  num4;
	
	multiplecons2()
	{
		num3=221;
		num4=313;
		
	}
	
	multiplecons2(int c,int d)
	{
		num3=c;
		num4=d;
		
	}
	
	public void mul() {
		System.out.println(num3*num4);
		
	}
	
}
