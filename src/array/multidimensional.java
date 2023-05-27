package array;

public class multidimensional {
public static void main(String[] args) 
{
	
  //multidimensional array object
	int i1 [][]=new int[2][3];
	
	//   0 1 2
	// 0 3 4 5
	// 1 6 9 3
	
	i1[0][0]=7;
	i1[0][1]=4;
	i1[0][2]=5;
	i1[1][0]=6;
	i1[1][1]=9;
	i1[1][2]=3;
	
	System.out.println(i1[1][2]);
	System.out.println(i1.length);
	System.out.println("print all data");
	
	for(int i=0;i<=i1.length-1;i++)//for rows
	{
		for(int j=0;j<=2;j++)//for columns
		{
			System.out.print(i1[i][j]+" ");
		}
		System.out.println();
		
	}
}
}