package assignments;

public class ascendinganddescendingwithoutsort {

	public static void main(String[] args) {
		
		int arr []= {23,6,2,8,4,9};
		int temp;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
			System.out.println(arr[i]);
		}
		
		System.out.println("------------------------------");
		int arr1 []= {23,6,2,8,4,9};
		int temp1;
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=i+1;j<arr1.length;j++)
			{
				if(arr1[i]<arr1[j])
				{
					temp1=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp1;
				}
				
			}
			System.out.println(arr1[i]);
		}
	}
}
