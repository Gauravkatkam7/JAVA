 package assignments;

public class factorial {

	public static void main(String[] args) {
		
		int num=4;
		int fact=1;
		   // 4 ,3
		for(int i=num; i>=1; i--) //4*3*2*1
		{
			fact=fact*i;  //1*4=4 4*3=12 12*2=24 24*1=24
			
		}
		System.out.println(fact);
	}
}
