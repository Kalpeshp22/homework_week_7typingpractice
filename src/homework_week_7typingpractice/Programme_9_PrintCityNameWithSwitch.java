package homework_week_7typingpractice;

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class Programme_9_PrintCityNameWithSwitch {

    public static void main(String[] args) {
        // Scanner declartion for reaing input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Pleae enter alphabet between A to F ");
        String city = scanner.next().toUpperCase();
        // Create object and call instance method
        Programme_9_PrintCityNameWithSwitch cityName = new Programme_9_PrintCityNameWithSwitch();
        cityName.printCityName(city);
        // clsoing the scanner object
        scanner.close();
    }

    // printing city name
    public void printCityName(String city) {
        switch (city) {
            case "A":
                System.out.println(" Aberdeen");
                break;
            case "B ":
                System.out.println(" Belfast");
                break;
            case "C":
                System.out.println(" Cambridge");
                break;
            case "D":
                System.out.println(" Derby");
                break;
            case "E":
                System.out.println(" Edinbrough");
                break;
            case "F":
                System.out.println(" Feltham");
                break;
            default:
                System.out.println(" The Alphabet you enter is not between A to F ");
        }
    }

}
