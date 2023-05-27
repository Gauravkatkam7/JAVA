package array;

public class multidimensional6 {

	public static void main(String[] args) {
		
		int s1[][]= {{22,43,65},{33,102,22}};
		
		int smallest=s1[0][0];
		int highest=s1[0][0];
		
		
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=2;j++)
			{
				System.out.print(s1[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=2;j++)
			{
				if(s1[i][j]>highest)
				{
					highest=s1[i][j];
				}
				 if(s1[i][j]<smallest)
				{
					smallest=s1[i][j];
				}
			}
			
		}
		System.out.println("smallest:"+smallest);
		System.out.println("highest:"+highest);
}
}
