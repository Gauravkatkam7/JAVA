package returntype;

public class sample7 {

	public static void main(String[] args) {
		
		char c2=m3('a');
		System.out.println(c2);
		System.out.println("-----------");
		
		System.out.println(m3('g'));
		
		sample7 s7=new sample7();
		float f3=s7.m4(12.5f);
		System.out.println(f3);
		System.out.println("-----------");
		System.out.println(s7.m4(33.4f));
		
	}
	
	public static char m3(char s1) {
		char c1=s1;
		return c1;
		
	}
	public float m4(float f1)
	{
		float f2=f1;
		return f1;
		
	}
}
