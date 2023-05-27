package staticandnonstaticdiff;

public class example12 {
public static void main(String[] args) {
	

	example11 o1=new example11();
	o1.girlname="smita";
    o1.girlsirname="gaikwad";
    
    example11 o2=new example11();
    o2.girlname="smita";
    o2.girlsirname="gaikwad";
    
    example11 o3=new example11();
    o3.girlname="smita";
    o3.girlsirname="sharma";
    
    o1.marriage();
    o2.marriage();
    o3.marriage();
      
}
}