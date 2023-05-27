package array;

public class multidimensional3 {

	public static void main(String[] args) {
		
		int i1[][]= {{2,3,4},{5,6,7},{4,6,9}};
		
		System.out.println(i1[2][1]);
		System.out.println(i1.length);
		for(int i=0;i<=2;i++)
		{
			for(int k=0;k<=2;k++)
			{
				System.out.print(i1[i][k]+" ");
			}
			System.out.println();
		}
		
		
	}
}
