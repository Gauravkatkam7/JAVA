package staticandnonstaticdiff;

public class example8 {

	public static void main(String[] args) {
		
		example7 o3=new example7();
		o3.empname="saipan";
		o3.empid=32;
		example7.empceoname="pichai";
		
		example7 o2=new example7();
		o2.empname="gaurav";
		o2.empid=55;
		example7.empceoname="pichai";
		
		example7 o1=new example7();
		o1.empname="saurabh";
		o1.empid=44;
		example7.empceoname="sundar";
		
		o3.empdetails();
		o2.empdetails();
		o1.empdetails();
	}
}
