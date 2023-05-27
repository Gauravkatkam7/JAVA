package assignments;

public class reversestringinsameposition {

	public static void main(String[] args) {
		
		String s1="Plant Trees in garden";
		System.out.println(s1.length());
		
		String a[]=s1.split(" ");
		System.out.println(a.length);
		
		for(int i=0;i<=a.length-1;i++);
		{
			
			String c []=a[i].split("");
			String d="";
			
			for(int j=c.length-1;j>=0;j--)
			{
				d=d+c[j];
			}
			System.out.println(d);	
		}
	}
}
