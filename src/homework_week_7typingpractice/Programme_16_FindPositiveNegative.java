package homework_week_7typingpractice;

import java.util.Scanner;

/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */

public class Programme_16_FindPositiveNegative {
    public static void main(String[] args) {
        // Scanner declration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter a number");
        int number = scanner.nextInt();
        findNumberIsPositiveNegetiveOrZero(number);
        // clsoing the scanner object
        scanner.close();
    }
     // Finding the number is Postive Negetive or Zero
     public static void findNumberIsPositiveNegetiveOrZero(int number ){
        if (number > 0) {
            System.out.println( number + " is a POSTIVE number");
        }  else if (number < 0) {
            System.out.println(number + " is a NEGITIVE number" );
        } else {
            System.out.println( number+ " is ZERO");
        }
     }


}
