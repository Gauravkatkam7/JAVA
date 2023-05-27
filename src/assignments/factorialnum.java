package assignments;

public class factorialnum {

	public static void main(String[] args) {
		
		int num=4;
		 int fact=1;
		 
		 for(int i=num; i>=1; i--)
		 {
			 fact=fact*i; //1*4=4,4*3=12,12*2=24 24*1=21
		 }
		 System.out.println(fact);
	}
}
