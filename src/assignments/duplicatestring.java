package assignments;

public class duplicatestring {

public static void main(String[] args) {
		
	String arr[]= {"gaurav","shubham","kumbhar","gaurav","rohan","shubham"};
		
		for(int i=0;i<=arr.length-1;i++)
		{  
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("duplicate string found:"+arr[i]);
				}
				// 1        2 
			}
			
		}
	}
}
