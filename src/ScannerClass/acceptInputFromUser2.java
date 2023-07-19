package ScannerClass;

import java.util.Scanner;

public class acceptInputFromUser2 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Num:");
		int a = sc.nextInt();
		System.out.println(a+a);
		
		System.out.println("Enter student Name:");
		String b=sc.next();
		System.out.println(b.toUpperCase());
	
	}
}
