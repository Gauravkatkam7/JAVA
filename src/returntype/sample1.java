package returntype;

public class sample1 {

	public static void main(String[] args) {
		
		int sample=m1(32,43);
		System.out.println(sample);
		
		System.out.println(m1(3,34));
		
		System.out.println("-----------------");
		
		sample1 s1=new sample1();
		
		int s2=s1.m2(32, 243);
		
		System.out.println(s2);
		System.out.println(s1.m2(43,5));
		
		System.out.println("-----------------");
		
		String s3=sample2.m3("gaurav");
		System.out.println(sample2.m3("gaurav"));
		
	}
	
	
	 public static int m1(int a, int b)
	 {
		int c=a+b;
		return c;
	 }
	public int m2(int a,int b) {
		int multi=a*b;
		return multi;
	}
	}

