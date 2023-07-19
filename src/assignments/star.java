package assignments;



public class star {

	public static void main(String[] args) { 
                                           
		star s1=new star();             
		s1.m1();                              
		s1.m2();                            
		s1.m3();
		s1.m4();
		s1.m5();
		s1.m11();
		s1.m16();
		s1.m17();
		s1.m12();
		s1.m13();
		s1.m18();
		s1.m6();
		s1.m7();
		s1.m8();
		s1.m10();
		s1.m14();
		s1.m15();
		s1.m19();
		s1.p9();
		s1.m20();
		s1.m21();
		
		
		
			
	}
	
	
	public void m1() {
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("*");
		}
	}
	
	public void m2() {
		System.out.println("suare fill pattern"+"\n");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public void m3() {
		System.out.println("right half puramid or 1st quadrant"+"\n");
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public void m4() {
		
		System.out.println("reverse right half pyramid or 4th quadrant"+"\n");
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public void m5() {
		System.out.println("left half pyramidor 2nd quadrant"+"\n");
		
	
		
		  for(int i=1;i<=5;i++)
		  {
			  for(int j=1;j<=5*2-i*2;j++)
			  {
				  System.out.print(" ");
			  }
			  for(int k=1;k<=i;k++)
			  {
				  System.out.print("* ");
			  }
			  System.out.println();
			 
		  }
		  int star=1;
			int space=8;
			
			  for(int i=1;i<=5;i++)
			  {
				  for(int j=1;j<=space;j++)
				  {
					  System.out.print(" ");
				  }
				  for(int k=1;k<=star;k++)
				  {
					  System.out.print("* ");
				  }
				  System.out.println();
				 star++;
				 space=space-2;
			  }
			                                       
	}    
	public void m11() {
		System.out.println("reverse left half pyramid or 3rd quadrant");
		
		int star=5;
		int space=0;
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
			star--;
			space=space+2;
		}
	}
	
	public void m16()
	{
		System.out.println("pyramid");
		int star=1;
		int space=4;
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
			star++;
			space--;
		}
	}
	public void m17()
	{
		System.out.println("inverted pyramid");
	
		
		int star=5;
		int space=0;
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
			star--;
			space++;
	}
	}
	
	
	
	
	public void m12() {
		System.out.println("4th and 1st quadrant");
		int star=5;
		                                            
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=star;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			star--;
		}
		int star1=2;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=star1;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			star1++;
		}
		
	}
	
	public void m13() {
		System.out.println("right rhombus pattern");
		int star=4;
		int space=0;
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
			space++;
		}
	}
	public void m18() {
		System.out.println("left rhombus pattern");
		int star=4;
		int space=4;
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
			space--;
		}
	}
		
		
		
		
	
		                                          
	public void m6()
	{
		System.out.println("hollow pattern");
		int r=5;
		int c=5;
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=c;j++)
			{
			
				if(i==1||j==1||i==r||j==c)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println("");
			
		}
	}
	public void m7()
	{
		System.out.println("diamondless pattern");
		int star=5;
		int space=0;
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			for(int k=1;k<=space;k++)
			{
				System.out.print(" ");
			}

			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			star--;
			space=space+2;
			
		}
		m9();
	}
			
			public static void m9() {
				
			
			
			int star=1;
			int space=8;
			
			for(int i=1;i<=5;i++)
			{
				for(int j=1;j<=star;j++)
				{
					System.out.print("*");
				}
				for(int k=1;k<=space;k++)
				{
					System.out.print(" ");
				}
				for(int l=1;l<=star;l++)
				{
					System.out.print("*");
				}
				System.out.println();
				star++;
				space=space-2;
			}
			
			
			}
			public void m8()
			{
				System.out.println("diamond");
				for(int i=1;i<=5;i++)
				{
					for(int j=4;j>=i;j--)
					{
						System.out.print(" ");
					}
					for(int k=1;k<=i;k++)
					{
						System.out.print("* ");
					}
					System.out.println();
				}
				for(int i=1;i<=4;i++)
				{
					for(int j=1;j<=i;j++)
					{
						System.out.print(" ");      
					}                                
					for(int k=4;k>=i;k--)
					{
						System.out.print("* ");
					}
					System.out.println();
				}
				
			}
			public void m10() {
				System.out.println("character");
				char ar[][]= {{'*','*','*','*'},{'*',' ',' ',' '},{'*','*','*','*'},{' ',' ',' ','*'},{'*','*','*','*'}};
				
				for(int i=0;i<=4;i++)
				{
					for(int j=0;j<=3;j++)
					{
						System.out.print(ar[i][j]+" ");
					}
					System.out.println();
				}
			}
			
			public void m14() {
				System.out.println("1st and 4th quadrant");
				
				int star=1;
				for(int i=1;i<=5;i++)
				{
					for(int j=1;j<=star;j++)
					{
						System.out.print("* ");
					}
					System.out.println();
					star++;
				}
				star=4;
				for(int i=1;i<=4;i++)
				{
					for(int j=1;j<=star;j++)
					{
						System.out.print("* ");
					}
					System.out.println();
					star--;
				}
				
			}
			public void m15()
			{
				System.out.println("3rd and 2nd quadrant");
				int star=5;
				int spaces=0;
				
				for(int i=1;i<=5;i++)
				{
					for(int j=1;j<=spaces;j++)
					{
						System.out.print(" ");
					}
					for(int k=1;k<=star;k++)
					{
						System.out.print("* ");
					}
					System.out.println();
					star--;
					spaces=spaces+2;
				}
				int star1=2;
				int spaces1=6;
				
				for(int i=1;i<=4;i++)
				{
					for(int j=1;j<=spaces1;j++)
					{
						System.out.print(" ");
					}
					for(int k=1;k<=star1;k++)
					{
						System.out.print("* ");
					}
					System.out.println();
					star1++;
					spaces1=spaces1-2;
				}
			}
			
			public void m19() {
				System.out.println("2nd and 3rd quadrant");
				int star1=1;
				int spaces1=4;
				
				for(int i=1;i<=5;i++)
				{
					for(int j=1;j<=spaces1;j++)
					{
						System.out.print(" ");
					}
					for(int k=1;k<=star1;k++)
					{
						System.out.print("*");
					}
					System.out.println();
					star1++;
					spaces1--;;
				}
				int star=4;
				int spaces=1;
				
				for(int i=1;i<=4;i++)
				{
					for(int j=1;j<=spaces;j++)
					{
						System.out.print(" ");
					}
					for(int k=1;k<=star;k++)
					{
						System.out.print("*");
					}
					System.out.println();
					star--;
					spaces++;
				}
			}
			public static void p9() 
			{ 
				System.out.println("2nd and 3rd quadrant");
			
			int star=1; 
			int spaces=4; 
			for(int i=1;i<=9;i++) 
			{ 
			for(int k=1; k<=spaces;k++) { 
			System.out.print(" "); 
			} 
			for(int j=1;j<=star;j++) { 
			System.out.print("*"); 
			} 
			System.out.println(""); 
			if(i<=4) { 
			star++; 
			spaces--; 
			} 
			else { 
			star--; 
			spaces++; 
			} 
			 
			}
			}
			
			public static void m20()
			{
				int count=1;
				
				for(int i=1;i<=4;i++)
				{
					for(int j=1;j<=i;j++)
					{
						System.out.print(count+" ");
						count++;
					}
					System.out.println();
				}
				
			}
			
			public static void m21()
			{
				char ch='A';
				
				for(int i=1;i<=7;i++)
				{
					for(int j=1;j<=i;j++)
					{
						System.out.print(ch+" ");
						ch++;
					}
					System.out.println();
				}
			}
			
				
				
				
				
			}
		
			
			
			
			
			
				
			
		
	
	
		
	
	

                     


                   

