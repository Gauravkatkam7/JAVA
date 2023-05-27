package assignments;

public class duplicatenumber {

	public static void main(String[] args) {
		
		int arr[]= {1,1,2,3,4,5,5,8,9};
		
		for(int i=0;i<=arr.length-1;i++)
		{       //   0+1=1
			for(int j=i+1;j<=arr.length-1;j++)
			{   //    1      2
				if(arr[i]==arr[j])
				{
					System.out.println("duplicate num found:"+arr[i]);
				}
				// 1        2 
			}
			
		}
	}
}
