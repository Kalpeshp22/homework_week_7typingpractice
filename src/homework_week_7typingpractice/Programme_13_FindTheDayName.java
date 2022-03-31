package homework_week_7typingpractice;

import java.util.Scanner;

public class Programme_13_FindTheDayName {
    public static void main(String[] args) {
        // Scanner declartion for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Input a number between 1 and 7: ");
        int day = scanner.nextInt();
        findTheDaysName(day);
        // Closing the scanner object
        scanner.close();
    }
     // Finding the snam oe the day
      public static void findTheDaysName(int day){
        switch ( day){
            case 1:
                System.out.println(" It is Monday");
                break;
            case 2:
                System.out.println(" It is Tuesday");
                break;
            case 3:
                System.out.println(" IT is Wednesday");
                break;
            case 4:
                System.out.println(" It is Thursday");
                break;
            case 5:
                System.out.println(" It is Friday");
                break;
            case 6:
                System.out.println(" It is Saturday");
                break;
            case 7:
                System.out.println(" It is Sunday");
                break;
            default:
                System.out.println( " Week contains 1 to 7 days");
        }
      }

}
