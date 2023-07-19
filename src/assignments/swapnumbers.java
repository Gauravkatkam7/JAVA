package assignments;

public class swapnumbers {

	int num1;
	
	swapnumbers(int a)
	{
		num1=a;
	}
	
	public int s1()
	{
		return num1;
	}
	
	public static void main(String[] args) {
		
		Object temp;
		swapnumbers o1=new swapnumbers(20);
//		System.out.println(o1.s1());
		
		swapnumbers o2=new swapnumbers(100);
//		System.out.println(o2.s1());
		
//		temp=o1;   //20
//		o1=o2;     //100
//		o2=(swapnumbers) temp;//20
		swap(o1.s1(), o2.s1());
		System.out.println("------------");
//		System.out.println("o1="+o1.s1());
//		System.out.println("o2="+o2.s1());
//		System.out.println("--------------");
//		
		
	}
	
	public static void swap (Object c1,Object c2)
	{
		Object temp =c1;
		c1=c2;
		c2=temp;
	
		
		System.out.println("swap number for s1 is "+c1);
		System.out.println("swap number for s2 is "+c2);
	}
	
	

}
