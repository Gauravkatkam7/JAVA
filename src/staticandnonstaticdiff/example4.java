package staticandnonstaticdiff;

public class example4 {

	public static void main(String[] args) {
		
		example3 o1=new example3();
		o1.playername="gaurav";
		o1.playerno=1;
		example3.playercoach="dattasir";
		
		example3 o2=new example3();
		o2.playername="amit";
		o2.playerno=2;
		example3.playercoach="dattasir";
		
		example3 o3=new example3();
		o3.playername="shaam";
		o3.playerno=3;
		example3.playercoach="sonusir";
		
		o1.sports();
		o2.sports();
		o3.sports();
	}
}
