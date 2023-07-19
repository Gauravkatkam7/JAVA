package ScannerClass;

import java.util.Scanner;

public class acceptInputFromUser {

	public static void main(String[] args) {
		
//		Scanner scan=new Scanner(System.in);
//		
//		 int s1 = scan.nextInt();
//		
//		System.out.println(s1+s1);
		
		
		Scanner scan=new Scanner(System.in);
		String s1 = scan.next();
		
//		System.out.println(s1.toLowerCase());
//		System.out.println(s1.charAt(3));
	//	System.out.println(s1.endsWith("v"));
		System.out.println(s1.startsWith("d"));
		System.out.println(s1.indexOf("v"));
		
		
	}
}
