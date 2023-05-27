package returntype;

public class sample3 {

	 public static void main(String[] args) {
		
		 m1(34,50);
	
		 int sample1=m3("gaurav");
		 System.out.println(sample1);
	}
	 
	 public static int m1(int a ,int b) {
		int c=a+b;
		return c;
	}
	 
	 public static int m3(String name) {
		String s1=name.toUpperCase();
	
		return 34;
	}
}
