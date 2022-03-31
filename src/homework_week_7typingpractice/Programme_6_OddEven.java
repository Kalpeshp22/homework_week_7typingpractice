package homework_week_7typingpractice;


import java.util.Scanner;

public class Programme_6_OddEven {
    public static void main(String[] args) {
        // Scanner declartion of reading input from consle
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the number you wna to check");
        int number = scanner.nextInt();
        Programme_6_OddEven oddEven =new Programme_6_OddEven();
        System.out.println(number + " is " + oddEven.isItEvenOrOddNumber(number) + " number");
        // closing the scanner object.
        scanner.close();
    }
      // Checking the odd or even
    public String isItEvenOrOddNumber(int number){
        if (number % 2 == 0){
            return "Even";

        } else {
            return "Odd";
        }
    }
}

