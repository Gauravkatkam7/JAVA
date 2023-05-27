package staticandnonstaticdiff;

public class example10 {

	public static void main(String[] args) {
		
	
	example9 o1=new example9();
	o1.name="gaurav";
	o1.sno=323;
	example9.sdivision='b';
	
	example9 o2=new example9();
	o2.name="dheeraj";
	o2.sno=324;
	example9.sdivision='b';
	
	example9 o3=new example9();
	o3.name="saurabh";
	o3.sno=325;
	example9.sdivision='a';
	
	o1.name();
	o2.name();
	o3.name();
}
}