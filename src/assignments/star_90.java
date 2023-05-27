package assignments;

public class star_90 {

	public static void main(String[] args) {
		    // 1,2,3,4,5
		for(int i=1; i<=5; i++)
			
		{  // 1,2,3,4,5  1<=1,1<=2,2<=2,1<=3,2<=3,3<=3.......
			for(int j=1; j<=i; j++) {
				
			
			System.out.print("* ");
		}
			System.out.println(" ");
			
		}
	
		//  5,4,3,2,1
		for(int i=5; i>=1; i--)
		{    //  1,2,3,4,5  1<=5,2<=5,3<=5,4<=5,5<=5,1<=4,2<=4,3<=4,4<=4....
			for(int j=1; j<=i-1; j++) 
			{
				
				System.out.print("* ");
			}
			System.out.println();
				
		}
		
	}
}
