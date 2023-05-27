package constructor;

public class staticandnonstaticdiff2 {

	

	public static void main(String[] args) {
		
		staticandnonstaticdiff o1=new staticandnonstaticdiff();
		o1.sname="gaurav";
		o1.sno=323;
		staticandnonstaticdiff.principlename="shubham";
		
		staticandnonstaticdiff o2=new staticandnonstaticdiff();
		o2.sname="kumbhar";
		o2.sno=32;
		staticandnonstaticdiff.principlename="shubham";
		
		staticandnonstaticdiff o3=new staticandnonstaticdiff();
		o3.sname="rohan";
		o3.sno=44;
		staticandnonstaticdiff.principlename="prashant";
		
		o1.school();
		o2.school();
		o3.school();
	}
}
