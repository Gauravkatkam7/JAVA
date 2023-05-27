package staticandnonstaticdiff;

public class example2 {

	
	public static void main(String[] args) {
		
		
		example o1=new example();
		o1.empname="gaurav";  //diffclassobjectnaame.veriablename
		example.empceoname="dheeraj";//diffclassname.veriablename
		
		example o2=new example();
		o2.empname="saurabh";
		o2.empid=34;
		example.empceoname="dheeraj";
		
		
		
		example o3=new example();
		o3.empname="shubham";
		o3.empid=55;
		example.empceoname="kumbhar";
		
		o1.empinfo();
		o2.empinfo();
		o3.empinfo();
	}
}
