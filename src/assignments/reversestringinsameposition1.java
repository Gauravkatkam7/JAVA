package assignments;

public class reversestringinsameposition1 {


		
	public static void main(String[] args) 
	{
//	  {
//		String str="Nothing Lasts Forever";
//		String[] ar1=str.split(" ");
//		
//		for(int i=0;i<=ar1.length-1;i++)
//		{
//			String[] ar2 = ar1[i].split("");
//			String a="";
//			for(int j=ar2.length-1;j>=0;j--)
//			{
//				a=a+ar2[j];
//			}
//			System.out.print (a+" ");   
//		}
//	  }
		
		String s1="plant trees";
		
		String [] a=s1.split(" ");
		
		for(int i=0;i<=a.length-1;i++)
		{
			String [] b=a[i].split("");
			String c="";
			for(int j=b.length-1;j>=0;j--)
			{
				c=c+b[j];
			}
			System.out.print(c+" ");
		}
}
}
