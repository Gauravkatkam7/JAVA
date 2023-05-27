package assignments;

public class highestandlowest2 {

public static void main(String[] args) {
		     //        0            1             2
		int s1[][]= {{-22,43,65},{33,102,22},{45,-111,105}};
		 //            0   1  2   0   1   2    0   1   2
		
		int smallest=s1[0][0];
		int highest=s1[0][0];
		      // 1
		for(int i=0;i<=2;i++)
		{      //    1
			for(int j=0;j<=2;j++)
			{
				if(s1[i][j]>highest)
				{
					highest=s1[i][j];//-22
				}
				 if(s1[i][j]<smallest)
				{
					smallest=s1[i][j];//-22
				}
			}
			
		}
		System.out.println("smallest:"+smallest);
		System.out.println("highest:"+highest);
}
}

