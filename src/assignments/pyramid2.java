package assignments;

public class pyramid2 {

	
public static void main(String[] args) {
	

    // Top half of diamond pattern
    for (int i = 1; i <= 10; i++) {
       for (int j = 1; j <= (10 - i); j++) {
          System.out.print(" ");
       }
       for (int k = 1; k <= (2 * i - 1); k++) {
          System.out.print("*");
       }
       System.out.println();
    }

    // Bottom half of diamond pattern
    for (int i = 10 - 1; i >= 1; i--) {
       for (int j = 1; j <= (10 - i); j++) {
          System.out.print(" ");
       }
       for (int k = 1; k <= (2 * i - 1); k++) {
          System.out.print("*");
       }
       System.out.println();
    }
 }
}

