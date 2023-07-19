package practice;
public class reverseWordOfEvenPosition{
public static void main(String[]args){

	String org="my name is gaurav";
	
	String ar[]=org.split(" ");
	
	for(int i=0;i<ar.length-1;i++)
	{
		String str=ar[i];
		String rev="";
		if(i%2==0)
		{
			for(int j=str.length()-1;j>=0;j--)
			{
				rev=rev+str.charAt(j);		
			}
		}
		System.out.print(rev+" ");
	} 

}
}