package array;

public class multidimensional4 {
public static void main(String[] args) {
	

	int i1[][]= {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};

	System.out.println(i1[2][2]);
	
	for(int i=0;i<=3;i++)
	{
		for(int j=0;j<=2;j++)
		{
			System.out.print(i1[i][j]+" ");
		}
		System.out.println();
	}
	
}
}