package homework_week_7typingpractice;

import java.util.Scanner;
/* 1. Write a java program that tells us that Input number is odd or even?
*  Hint use tenrary operator ( ? ; )
 */

public class Programme_1_OddEvenTernaryOperator {

    public static void main(String[] args) {
    // Scanner declartion for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("  Please enter the number ; ");
        int number = scanner.nextInt();
        isItoddOrEvennumber( number);
        // closing the scanner object
        scanner.close();
    }
    // checking the number is even or odd

    public static void isItoddOrEvennumber ( int  number){
        // ternary operator is used
        String evenOrOdd = ( number % 2 == 0)? "Even" : " odd";
        System.out.println( " The " + number  + " is " + evenOrOdd + "number");
    }

}
