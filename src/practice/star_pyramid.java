package practice;

public class star_pyramid {

	public static void main(String[] args) {
		
		int space=4;
		for(int i=0;i<=5;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for( int k=1;k<=i;k++)
			{
				System.out.print(" "+k);
			}
			System.out.println();
		}
	}
}
