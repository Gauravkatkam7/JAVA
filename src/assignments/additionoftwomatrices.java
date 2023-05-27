package assignments;

public class additionoftwomatrices {
public static void main(String[] args) {
	

	int i1[][]= {{1,4,5},{6,7,8}};
	int i2[][]= {{3,5,2},{6,2,8}};
	
//	     i1         i2
//      0 1 2      0 1 1 
//	 0  1 4 5   0  3 5 2
//	 1  6 7 8   1  6 2 8
//	
	
	//creating another matrices to store the addition of two number
	int i3[][]=new int[2][3];
	
	for(int i=0;i<=1;i++)
	{
		for(int j=0;j<=2;j++)
		{
		 i3[i][j]=i1[i][j]+i2[i][j];
			System.out.print(i3[i][j]+" ");
		}
		System.out.println();
	}
}	
}
